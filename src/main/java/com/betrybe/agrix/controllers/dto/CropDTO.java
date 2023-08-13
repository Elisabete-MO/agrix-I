package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;

public record CropDTO(int id, Farm farm, String name, Double plantedArea) {
  public Crop toCrop() {
    return new Crop(id, farm, name, plantedArea);
  }
}
