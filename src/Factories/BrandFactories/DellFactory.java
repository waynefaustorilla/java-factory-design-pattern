package Factories.BrandFactories;

import Computers.Computer;
import Computers.ComputerBrands.DellComputer;
import Factories.Factory;

public class DellFactory implements Factory {
  public Computer orderComputer() {
    return new DellComputer();
  }
}