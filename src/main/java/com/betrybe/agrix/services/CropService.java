//package com.betrybe.agrix.services;
//
//import com.betrybe.agrix.models.entities.Crop;
//import com.betrybe.agrix.models.repositories.CropRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CropService {
//  private final CropRepository cropRepository;
//
//  @Autowired
//  public CropService(CropRepository cropRepository) {
//    this.cropRepository = cropRepository;
//  }
//
//  public Crop insertCrop(Crop crop) {
//    return cropRepository.save(crop);
//  }
//
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
//  public List<Crop> getAllCrops() {
//    return cropRepository.findAll();
//  }
//}
