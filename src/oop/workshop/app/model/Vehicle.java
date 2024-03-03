package oop.workshop.app.model;

import oop.workshop.app.services.vehicle.MoveForward;
import oop.workshop.app.services.vehicle.ParkVehicle;
import oop.workshop.app.services.vehicle.StopVehicle;
import oop.workshop.app.services.vehicle.TurnRightVehicle;

public abstract class Vehicle implements MoveForward, StopVehicle, TurnRightVehicle, ParkVehicle {

  private String plate;
  private String brand;
  private String maxSpeed;
  private String color;

  protected Vehicle() {
  }

  protected Vehicle(String plate, String brand, String maxSpeed,String color) {
    this.plate = plate;
    this.brand = brand;
    this.maxSpeed = maxSpeed;
    this.color = color;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getPlate() {
    return plate;
  }

  public String getBrand() {
    return brand;
  }

}
