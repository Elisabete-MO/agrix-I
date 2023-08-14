package com.betrybe.agrix.controllers;

import com.betrybe.agrix.controllers.dto.CropDto;
import com.betrybe.agrix.services.CropService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the Crop entity.
 */
@RestController
@RequestMapping(value = "/crops")
public class CropController {

  private final CropService cropService;

  @Autowired
  public CropController(CropService cropService) {
    this.cropService = cropService;
  }

  /** Gets all the crops.
   *
   * @return A list with all the crops.
   */
  @GetMapping()
  public ResponseEntity<List<CropDto>> getAllCrops() {
    return ResponseEntity.ok(cropService.getAllCrops());
  }
}