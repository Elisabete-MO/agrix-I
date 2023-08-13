package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Farm;

public record FarmDTO(Integer id, String name, Double size) {
  public Farm toFarm() {
    return new Farm(id, name, size);
  }
}
