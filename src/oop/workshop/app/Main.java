package oop.workshop.app;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import oop.workshop.app.domain.model.MotorCycle;
import oop.workshop.app.domain.model.Vehicle;
import oop.workshop.app.infrastructure.adapter.CreateMotorCycle;

public class Main {

  public static void main(String[] args) {

    CreateMotorCycle createMotorCycle = new CreateMotorCycle();
    Vehicle motorCycle = createMotorCycle.createVehicle();

    System.out.println(motorCycle);
  }

  static Map<String,List<MotorCycle>> getAllElectricMotorCycles(List<MotorCycle> vehicleList) {
    return vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getMaxSpeed));
  }

  static String getClassName(){
    return Main.class.getSimpleName();
  }
  static void printElectricMotorMap(Map<String,List<MotorCycle>> vehicleMap, Logger logger) {
    vehicleMap.forEach((key, value) -> logger.config(key + " - " + value));
  }
}