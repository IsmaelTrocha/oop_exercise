package oop.workshop.app.model;

public class Car extends Vehicle {

  private Boolean isAutomatic;

  public Car(String plate, String brand, String maxSpeed, String color, Boolean isAutomatic) {
    super(plate, brand, maxSpeed, color);
    this.isAutomatic = isAutomatic;
  }

  public Car( ) {

  }

  @Override
  public void moveForward() {
    System.out.println("The Car is moving forward");
  }

  @Override
  public void parkVehicle() {
    System.out.println("The Car has been parked");
  }

  @Override
  public void stopVehicle() {
    System.out.println("The Car has been stopped");
  }
}
