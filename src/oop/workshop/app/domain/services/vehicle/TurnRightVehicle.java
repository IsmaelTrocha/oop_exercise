package oop.workshop.app.domain.services.vehicle;

public interface TurnRightVehicle {

  default void turnRightVehicle(){
    System.out.println(
        String.format("Moving the %s ",this.getClass().getSimpleName())+ "to the right.");
  }
}
