package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;

/**
 * Crop DTO.
 *
 * @param id          identifier of the crop
 * @param name        name of the crop
 * @param plantedArea area planted with the crop
 * @param farmId      identifier of the farm that the crop belongs to
 */
public record CropDto(int id, String name, Double plantedArea, Integer farmId) {
  public Crop toCrop(Farm farm) {
    return new Crop(id(), farm, name(), plantedArea());
  }

  public static CropDto fromCrop(Crop crop) {
    return new CropDto(crop.getId(), crop
        .getName(), crop.getPlantedArea(), crop.getFarm().getId());
  }
}
