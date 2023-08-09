package com.betrybe.agrix.evaluation.mock;

import java.util.Map;

public class CropFixtures {

  public final static MockCrop crop1 = new MockCrop(Map.of(
      "name", "Couve-flor",
      "plantedArea", 12.21
  ));

  public final static MockCrop crop2 = new MockCrop(Map.of(
      "name", "Abobrinha",
      "plantedArea", 34.45
  ));

  public final static MockCrop crop3 = new MockCrop(Map.of(
      "name", "Tomate",
      "plantedArea", 7.77
  ));

  public final static MockCrop crop4 = new MockCrop(Map.of(
      "name", "Alface",
      "plantedArea", 32.21
  ));

  public final static MockCrop crop5 = new MockCrop(Map.of(
      "name", "Rúcula",
      "plantedArea", 1.1
  ));
}
