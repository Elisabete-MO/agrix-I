package com.betrybe.agrix.services;

import com.betrybe.agrix.exceptions.FarmNotFoundException;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmService {
  private final FarmRepository farmRepository;

  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  public Farm insertFarm(Farm farm) {
    return farmRepository.save(farm);
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
//    return farmRepository.save(farmFromDB).OrElseThrow(() -> new FarmNotFoundException("Fazenda não encontrada!"));
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
//
//  public List<Farm> getAllFarms() {
//    return farmRepository.findAll();
//  }
}
