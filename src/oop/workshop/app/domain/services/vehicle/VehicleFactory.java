package oop.workshop.app.domain.services.vehicle;

import oop.workshop.app.domain.model.Vehicle;

public interface VehicleFactory <T extends Vehicle>{

  T createVehicle();

}
