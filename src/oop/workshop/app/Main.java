package oop.workshop.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import oop.workshop.app.domain.model.Car;
import oop.workshop.app.domain.model.MotorCycle;
import oop.workshop.app.domain.model.Vehicle;

public class Main {

  public static void main(String[] args) {

    Logger logger = Logger.getLogger(getClassName());
    Vehicle vehicle = new Car();

    vehicle.turnRightVehicle();

    List<Vehicle> vehicleList = new ArrayList<>();
    List<MotorCycle> motorCycleList = new ArrayList<>();

    vehicleList.add(vehicle);

    MotorCycle bike1 = new MotorCycle("ABC123", "Honda", "150 km/h", "Red", 250.0, true);
    MotorCycle bike2 = new MotorCycle("XYZ789", "Yamaha", "120 km/h", "Blue", 150.0, false);
    MotorCycle bike3 = new MotorCycle("DEF456", "Suzuki", "180 km/h", "Black", 300.0, true);
    MotorCycle bike4 = new MotorCycle("GHI789", "Kawasaki", "200 km/h", "Green", 400.0, false);
    MotorCycle bike5 = new MotorCycle("JKL012", "Ducati", "250 km/h", "Yellow", 500.0, true);
    MotorCycle bike6 = new MotorCycle("MNO345", "Harley Davidson", "160 km/h", "Orange", 200.0, false);
    MotorCycle bike7 = new MotorCycle("PQR678", "BMW", "190 km/h", "White", 350.0, true);
    MotorCycle bike8 = new MotorCycle("STU901", "Triumph", "170 km/h", "Silver", 300.0, false);
    MotorCycle bike9 = new MotorCycle("VWX234", "KTM", "140 km/h", "Purple", 180.0, true);
    MotorCycle bike10 = new MotorCycle("YZA567", "Aprilia", "220 km/h", "Gray", 450.0, false);



    printElectricMotorMap(getAllElectricMotorCycles(motorCycleList),logger);

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