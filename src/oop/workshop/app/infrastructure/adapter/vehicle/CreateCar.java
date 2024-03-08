package oop.workshop.app.infrastructure.adapter.vehicle;

import oop.workshop.app.domain.model.Car;
import oop.workshop.app.domain.services.vehicle.VehicleFactory;

public class CreateCar implements VehicleFactory <Car> {

  @Override
  public Car createVehicle() {
    return new Car("ABC-124","Chevrolet","300 KM","Negro",false);
  }
}
