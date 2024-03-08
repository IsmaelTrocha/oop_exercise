package oop.workshop.app.infrastructure.adapter;

import oop.workshop.app.domain.model.Car;
import oop.workshop.app.domain.services.vehicle.VehicleFactory;

public class CreateCar implements VehicleFactory <Car> {

  @Override
  public Car createVehicle() {
    return new Car("","","","",false);
  }
}
