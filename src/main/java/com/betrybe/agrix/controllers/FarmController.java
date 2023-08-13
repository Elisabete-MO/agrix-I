package com.betrybe.agrix.controllers;

import com.betrybe.agrix.controllers.dto.FarmDTO;
import com.betrybe.agrix.controllers.dto.ResponseDTO;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.services.CropService;
import com.betrybe.agrix.services.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/farms")
public class FarmController {

  private final FarmService farmService;

  @Autowired
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  @PostMapping()
  public ResponseEntity<Farm> createFarm(@RequestBody FarmDTO farmDTO) {
    Farm newFarm = farmService.insertFarm(farmDTO.toFarm());
//    ResponseDTO<Farm> responseDTO = new ResponseDTO<>(newFarm);
    return ResponseEntity.status(HttpStatus.CREATED).body(newFarm);
  }

//  @PutMapping("/{farmId}")
//  public ResponseEntity<ResponseDTO<Farm>> updateFarm(
//      @PathVariable Long farmId, @RequestBody FarmDTO farmDTO) {
//    Optional<Farm> optionalFarm = farmService.updateFarm(farmId, farmDTO.toFarm());
//
//    if (optionalFarm.isEmpty()) {
//      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
//          String.format("Não foi encontrada a marca de ID %d", farmId), null);
//      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
//    }
//
//    ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
//        "Marca atualizada com sucesso!", optionalFarm.get());
//    return ResponseEntity.ok(responseDTO);
//  }
//
//  @DeleteMapping("/{farmId}")
//  public ResponseEntity<ResponseDTO<Farm>> removeFarmById(@PathVariable Long farmId) {
//    Optional<Farm> optionalFarm = farmService.removeFarmById(farmId);
//
//    if (optionalFarm.isEmpty()) {
//      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
//          String.format("Não foi encontrada a marca de ID %d", farmId), null);
//      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
//    }
//
//    ResponseDTO<Farm> responseDTO = new ResponseDTO<>("Marca removida com sucesso!", null);
//    return ResponseEntity.ok(responseDTO);
//  }
//
//  @GetMapping("/{id}")
//  public ResponseEntity<ResponseDTO<Farm>> getFarmById(@PathVariable Integer id) {
//    Optional<Farm> optionalFarm = farmService.getFarmById(id);
//
//    if (optionalFarm.isEmpty()) {
//      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
//          "Fazenda não encontrada!", null);
//      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
//    }
//
//    ResponseDTO<Farm> response = new ResponseDTO<>(null, optionalFarm.get());
//    return ResponseEntity.ok(response);
//  }
//
//  @GetMapping()
//  public List<FarmDTO> getAllFarms() {
//    List<Farm> allFarms = farmService.getAllFarms();
//    return allFarms.stream()
//        .map((farm) -> new FarmDTO(farm.getId(), farm.getName(), farm.getSize()))
//        .collect(Collectors.toList());
//  }
//
//  @PostMapping("/{farmId}/crops/")
//  public ResponseEntity<ResponseDTO<Crop>> createCrop(
//      @RequestBody Crop CropDto, @PathVariable Integer farmId) {
//    Optional<Farm> optionalFarm = farmService.getFarmById(farmId);
//    if (optionalFarm.isEmpty()) {
//      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
//          "Fazenda não encontrada!", null);
//      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
//    }
//
//    Crop newCrop = CropService.insertCrop(CropDTO.toCrop());
//    ResponseDTO<Crop> responseDTO = new ResponseDTO<>(
//        null, newCrop);
//    return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
//  }
}
