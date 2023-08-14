package com.betrybe.agrix.controllers;

import com.betrybe.agrix.controllers.dto.FarmDto;
import com.betrybe.agrix.services.FarmService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the Farm entity.
 */
@RestController
@RequestMapping(value = "/farms")
public class FarmController {

  private final FarmService farmService;

  @Autowired
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /** Creates a new farm.
   *
   * @param farmDto DTO with the farm data.
   * @return The farm created.
   */
  @PostMapping()
  public ResponseEntity<FarmDto> createFarm(@RequestBody FarmDto farmDto) {
    FarmDto newFarm = farmService.insertFarm(farmDto);
    //ResponseDTO<Farm> responseDTO = new ResponseDTO<>(newFarm);
    return ResponseEntity.status(HttpStatus.CREATED).body(newFarm);
  }

  @GetMapping()
  public ResponseEntity<List<FarmDto>> getAllFarms() {
    return ResponseEntity.ok(farmService.getAllFarms());
  }


  @GetMapping("/{id}")
  public ResponseEntity<Optional<FarmDto>> getFarmById(@PathVariable Integer id) {
    Optional<FarmDto> optionalFarm = farmService.getFarmById(id);
    return ResponseEntity.ok(optionalFarm);
  }

  //  @PutMapping("/{farmId}")
  //  public ResponseEntity<ResponseDTO<Farm>> updateFarm(
  //      @PathVariable Long farmId, @RequestBody FarmDTO farmDTO) {
  //    Optional<Farm> optionalFarm = farmService.updateFarm(farmId, farmDTO.toFarm());
  //
  //    if (optionalFarm.isEmpty()) {
  //      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
  //          String.format("Não foi encontrada a marca de ID %d", farmId), null);
  //      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
  //    }
  //
  //    ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
  //        "Marca atualizada com sucesso!", optionalFarm.get());
  //    return ResponseEntity.ok(responseDTO);
  //  }
  //
  //  @DeleteMapping("/{farmId}")
  //  public ResponseEntity<ResponseDTO<Farm>> removeFarmById(@PathVariable Long farmId) {
  //    Optional<Farm> optionalFarm = farmService.removeFarmById(farmId);
  //
  //    if (optionalFarm.isEmpty()) {
  //      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
  //          String.format("Não foi encontrada a marca de ID %d", farmId), null);
  //      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
  //    }
  //
  //    ResponseDTO<Farm> responseDTO = new ResponseDTO<>("Marca removida com sucesso!", null);
  //    return ResponseEntity.ok(responseDTO);
  //  }
  //
  //
  //
  //  @PostMapping("/{farmId}/crops/")
  //  public ResponseEntity<ResponseDTO<Crop>> createCrop(
  //      @RequestBody Crop CropDto, @PathVariable Integer farmId) {
  //    Optional<Farm> optionalFarm = farmService.getFarmById(farmId);
  //    if (optionalFarm.isEmpty()) {
  //      ResponseDTO<Farm> responseDTO = new ResponseDTO<>(
  //          "Fazenda não encontrada!", null);
  //      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDTO);
  //    }
  //
  //    Crop newCrop = CropService.insertCrop(CropDTO.toCrop());
  //    ResponseDTO<Crop> responseDTO = new ResponseDTO<>(
  //        null, newCrop);
  //    return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO); }
}
