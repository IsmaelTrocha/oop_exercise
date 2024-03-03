import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import oop.workshop.app.model.Car;
import oop.workshop.app.model.MotorCycle;
import oop.workshop.app.model.Vehicle;

public class Main {

  public static void main(String[] args) {

    Vehicle vehicle = new Car();

    vehicle.turnRightVehicle();

    List<Vehicle> vehicleList = new ArrayList<>();


  }

  static Map<String,List<MotorCycle>> getAllElectricMotorCycles(List<MotorCycle> vehicleList) {
    return vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getMaxSpeed));
  }

  static void printElectricMotorMap(Map<String,List<MotorCycle>> vehicleMap) {
    vehicleMap.forEach((key, value) -> System.out.println(key + " - "+ value));
  }
}