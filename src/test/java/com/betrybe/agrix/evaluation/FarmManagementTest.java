package com.betrybe.agrix.evaluation;

import static com.betrybe.agrix.evaluation.util.TestHelpers.objectToJson;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.betrybe.agrix.evaluation.mock.FarmFixtures;
import com.betrybe.agrix.evaluation.mock.MockFarm;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@DisplayName("Req 01-03")
@DirtiesContext
class FarmManagementTest {

  MockMvc mockMvc;

  ObjectMapper jsonMapper = new ObjectMapper();

  @BeforeEach
  public void setup(WebApplicationContext wac) {
    // We need this to make sure the response body is in UTF-8,
    // since we're testing raw strings
    this.mockMvc = MockMvcBuilders
        .webAppContextSetup(wac)
        .defaultResponseCharacterEncoding(StandardCharsets.UTF_8)
        .build();
  }

  @Test
  @DisplayName("1- Crie uma API para controle de fazendas com a rota POST /farms")
  void testFarmCreation() throws Exception {
    MockFarm farm = new MockFarm(FarmFixtures.farm1);

    MockFarm result = performFarmCreation(farm);

    assertNotNull(result.get("id"), "A resposta deve incluir o ID da fazenda criada");

    // Add id so that comparison makes sense
    farm.put("id", result.get("id"));

    assertEquals(
        farm,
        result
    );
  }

  private MockFarm performFarmCreation(MockFarm farm) throws Exception {
    String responseContent = mockMvc.perform(post("/farms")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectToJson(farm)))
        .andExpect(status().isCreated())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andReturn().getResponse().getContentAsString();

    return jsonMapper.readValue(responseContent, MockFarm.class);
  }

  @Test
  @DisplayName("2- Crie a rota GET /farms")
  void testGetAllFarms() throws Exception {
    Set<MockFarm> farms = Set.of(FarmFixtures.farm1, FarmFixtures.farm2, FarmFixtures.farm3);
    Set<MockFarm> expectedFarms = new HashSet<>();

    for (MockFarm farm : farms) {
      MockFarm savedFarm = performFarmCreation(farm);
      expectedFarms.add(savedFarm);
    }

    String responseContent = mockMvc.perform(get("/farms").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andReturn().getResponse().getContentAsString();

    Set<MockFarm> returnedFarms = jsonMapper.readValue(responseContent,
        new TypeReference<>() {
        });

    assertEquals(
        expectedFarms,
        returnedFarms
    );
  }

  @Test
  @DisplayName("3- Crie a rota GET /farms/{id}")
  void testGetFarm() throws Exception {
    testGetFarmSuccess();
    testGetFarmNotFound();
  }

  void testGetFarmNotFound() throws Exception {
    mockMvc.perform(get("/farms/9999")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isNotFound())
        .andExpect(content().string(containsString("Fazenda não encontrada!")));
  }

  void testGetFarmSuccess() throws Exception {
    MockFarm farm = FarmFixtures.farm2;

    MockFarm savedFarm = performFarmCreation(farm);

    String farmUrl = "/farms/%s".formatted(savedFarm.get("id"));
    String responseContent = mockMvc.perform(get(farmUrl)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andReturn().getResponse().getContentAsString();

    MockFarm responseFarm = jsonMapper.readValue(responseContent, MockFarm.class);

    assertEquals(
        savedFarm,
        responseFarm
    );
  }
}
