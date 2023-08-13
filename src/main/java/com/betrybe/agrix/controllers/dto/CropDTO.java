package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;

public record CropDTO(int id, String name, Double plantedArea) {
  public Crop toCrop() {
    return new Crop(id, idFarm, name, plantedArea);
  }
}
