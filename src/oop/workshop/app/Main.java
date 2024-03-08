package oop.workshop.app;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import oop.workshop.app.domain.model.Car;
import oop.workshop.app.domain.model.MotorCycle;
import oop.workshop.app.domain.model.Vehicle;
import oop.workshop.app.infrastructure.adapter.vehicle.CreateCar;
import oop.workshop.app.infrastructure.adapter.vehicle.CreateMotorCycle;
import oop.workshop.app.infrastructure.adapter.vehiclesell.VehicleSellAdapter;

public class Main {

  public static void main(String[] args) {

    CreateMotorCycle createMotorCycle = new CreateMotorCycle();
    CreateCar createCar = new CreateCar();
    MotorCycle motorCycle = createMotorCycle.createVehicle();
    Car car = createCar.createVehicle();
    VehicleSellAdapter vehicleSellAdapter = new VehicleSellAdapter();

    System.out.println(vehicleSellAdapter.generateVehicleSell(car));
    System.out.println(vehicleSellAdapter.generateVehicleSell(motorCycle));;
    System.out.println(motorCycle.toString());
    System.out.println(car.toString());


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