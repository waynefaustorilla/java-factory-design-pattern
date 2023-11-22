package Factories.BrandFactories;

import Computers.ComputerBrands.AcerComputer;
import Factories.Factory;

public class AcerFactory implements Factory {
  public AcerComputer orderComputer() {
    return new AcerComputer();
  }
}