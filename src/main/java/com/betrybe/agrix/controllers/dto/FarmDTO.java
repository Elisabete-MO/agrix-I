package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;

import java.util.List;

public record FarmDTO(Integer id, String name, Double size, List<Crop> crops) {
  public Farm toFarm() {
    return new Farm(id, name, size, crops);
  }
}
