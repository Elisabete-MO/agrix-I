package com.betrybe.agrix.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Crop entity.
 */
@Entity
@Table(name = "crop")
public class Crop {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "farm_id")
  private Farm farm;

  private String name;

  @Column(name = "planted_area")
  private Double plantedArea;

  public Crop() {
  }

  /**
   * Crop constructor.
   *
   * @param id          identifier of the crop
   * @param idFarm     identifier of the farm
   * @param name        name of the crop
   * @param plantedArea area planted with the crop
   */
  public Crop(Integer id, Farm farm, String name, Double plantedArea) {
    this.id = id;
    this.farm = farm;
    this.name = name;
    this.plantedArea = plantedArea;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPlantedArea() {
    return plantedArea;
  }

  public void setPlantedArea(Double plantedArea) {
    this.plantedArea = plantedArea;
  }

  public Farm getFarm() {
    return farm;
  }

  public void setFarm(Farm farm) {
    this.farm = farm;
  }
}
