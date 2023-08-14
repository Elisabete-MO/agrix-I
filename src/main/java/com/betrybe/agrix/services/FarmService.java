package com.betrybe.agrix.services;

import com.betrybe.agrix.controllers.dto.FarmDto;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.FarmRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for the Farm entity.
 */
@Service
public class FarmService {
  private final FarmRepository farmRepository;

  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  public FarmDto insertFarm(FarmDto farmDto) {
    return FarmDto.fromFarm(farmRepository.save(farmDto.toFarm()));
  }

  /** Gets all the farms.
   *
   * @return A list with all the farms.
   */
  public List<FarmDto> getAllFarms() {
    List<Farm> farms = farmRepository.findAll();
    return farms.stream().map(e -> new FarmDto(
        e.getId(),
        e.getName(),
        e.getSize())).toList();
  }

  //  public Optional<Farm> updateFarm(Integer id, Farm farm) {
  //    Optional<Farm> optionalFarm = farmRepository.findById(id);
  //
  //    if (optionalFarm.isPresent()) {
  //      Farm farmFromDB = optionalFarm.get();
  //      farmFromDB.setName(farm.getName());
  //
  //      Farm updatedFarm = farmRepository.save(farmFromDB);
  //      return Optional.of(updatedFarm);
  //    }
  //    return farmRepository.save(farmFromDB)
  //    .OrElseThrow(() -> new FarmNotFoundException("Fazenda não encontrada!"));
  //  }
  //
  //  public Optional<Farm> removeFarmById(Integer id) {
  //    Optional<Farm> farmOptional = farmRepository.findById(id);
  //
  //    if(farmOptional.isPresent()) {
  //      farmRepository.deleteById(id);
  //    }
  //    return farmOptional;
  //  }
  //
  //  public Optional<Farm> getFarmById(Integer id) {
  //    return farmRepository.findById(id);
  //  }
}
