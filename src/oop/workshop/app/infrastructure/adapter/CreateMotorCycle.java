package oop.workshop.app.infrastructure.adapter;

import java.util.Scanner;
import oop.workshop.app.domain.model.MotorCycle;
import oop.workshop.app.domain.services.vehicle.VehicleFactory;

public class CreateMotorCycle implements VehicleFactory<MotorCycle> {

  @Override
  public MotorCycle createVehicle() {
    return new MotorCycle("ABC-123","Mazda","Rojo","20 KM",20.0,true);
  }
}
