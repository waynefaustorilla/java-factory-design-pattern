package Computers.ComputerBrands;

import Computers.Computer;

public class AcerComputer extends Computer {
  public AcerComputer() {
    super();

    this.setBrand("Acer");
    this.setMemory("16 GB");
    this.setProcessor("AMD Ryzen 5 5600G");
    this.setStorage("1 Terabyte NVME Samsung SSD");
    this.setGraphicsCard("AMD Radeon 8 GB");
  }

  @Override
  public void build() {
    String info = "Brand: " + this.getBrand() + "\nMemory: " + this.getMemory() + "\nProcessor: " + this.getProcessor() + "\nStorage: " + this.getStorage() + "\nGraphics Card: " + this.getGraphicsCard();

    System.out.println(info);
  }
}