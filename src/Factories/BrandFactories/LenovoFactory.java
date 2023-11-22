package Factories.BrandFactories;

import Computers.Computer;
import Computers.ComputerBrands.LenovoComputer;
import Factories.Factory;

public class LenovoFactory implements Factory {
  public Computer orderComputer() {
    return new LenovoComputer();
  }
}