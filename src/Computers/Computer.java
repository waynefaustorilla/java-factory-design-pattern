package Computers;

public abstract class Computer {
  private String processor;
  private String memory;
  private String storage;
  private String brand;
  private String graphicsCard;

  public Computer() {}

  public String getProcessor() {
    return this.processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public String getMemory() {
    return this.memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public String getStorage() {
    return this.storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getGraphicsCard() {
    return this.graphicsCard;
  }

  public void setGraphicsCard(String graphicsCard) {
    this.graphicsCard = graphicsCard;
  }

  public abstract void build();
}