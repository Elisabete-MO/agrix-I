package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;

/** Crop DTO.
 *
 * @param id identifier of the crop
 * @param farm identifier of the farm
 * @param name name of the crop
 * @param plantedArea area planted with the crop
 */
public record CropDto(int id, Farm farm, String name, Double plantedArea) {
  public Crop toCrop() {
    return new Crop(id, farm, name, plantedArea);
  }
}
