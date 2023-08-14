package com.betrybe.agrix.services;

import com.betrybe.agrix.controllers.dto.CropDto;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.CropRepository;
import java.util.List;
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
}

//  public Optional<Crop> updateCrop(Integer id, Crop crop) {
//    Optional<Crop> optionalCrop = cropRepository.findById(id);
//
//    if (optionalCrop.isPresent()) {
//      Crop cropFromDB = optionalCrop.get();
//      cropFromDB.setName(crop.getName());
//
//      Crop updatedCrop = cropRepository.save(cropFromDB);
//      return Optional.of(updatedCrop);
//    }
//    return optionalCrop;
//  }
//
//  public Optional<Crop> removeCropById(Integer id) {
//    Optional<Crop> cropOptional = cropRepository.findById(id);
//
//    if(cropOptional.isPresent()) {
//      cropRepository.deleteById(id);
//    }
//    return cropOptional;
//  }
//
//  public Optional<Crop> getCropById(Integer id) {
//    return cropRepository.findById(id);
//  }
//

