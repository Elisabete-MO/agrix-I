package com.betrybe.agrix.services;

import com.betrybe.agrix.controllers.dto.CropDto;
import com.betrybe.agrix.exceptions.CropNotFoundException;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.CropRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for the Crop entity.
 */
@Service
public class CropService {
  private final CropRepository cropRepository;

  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  /** Creates a new crop.
   *
   * @param cropDto  DTO with the crop data.
   * @param farm    Farm that the crop belongs to.
   * @return The crop created.
   */
  public CropDto insertCrop(CropDto cropDto, Farm farm) {
    Crop crop = cropDto.toCrop(farm);
    Crop insertedCrop = cropRepository.save(crop);
    return CropDto.fromCrop(insertedCrop);
  }

  /** Gets all the crops of a farm.
   *
   * @param farmId The farm id.
   * @return A list with all the crops of the farm.
   */
  public List<CropDto> getAllCropsByFarmId(Integer farmId) {
    List<Crop> crops = cropRepository.findAllByFarmId(farmId);
    return crops.stream().map(e -> new CropDto(
        e.getId(),
        e.getName(),
        e.getPlantedArea(),
        e.getFarm().getId())).toList();
  }

  /** Gets all the crops.
   *
   * @return A list with all the crops.
   */
  public List<CropDto> getAllCrops() {
    List<Crop> crops = cropRepository.findAll();
    return crops.stream().map(e -> new CropDto(
        e.getId(),
        e.getName(),
        e.getPlantedArea(),
        e.getFarm().getId())).toList();
  }

  /** Gets a crop by id.
   *
   * @param id Crop id.
   * @return The crop with the given id.
   */
  public Optional<CropDto> getCropById(Integer id) {
    return cropRepository.findById(id)
        .map(e -> new CropDto(e.getId(), e.getName(), e.getPlantedArea(), e.getFarm().getId()))
        .map(Optional::of)
        .orElseThrow(() -> new CropNotFoundException("Plantação não encontrada!"));
  }
}