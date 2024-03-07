package oop.workshop.app.domain.model;

public final class MotorCycle extends Vehicle{

  private Double cylinder;
  private Boolean isMechanical;

  public MotorCycle (String plate, String brand, String color, String maxSpeed, Double cylinder,
      Boolean isMechanical){
    super(plate, brand, color, maxSpeed);
    this.cylinder = cylinder;
    this.isMechanical = isMechanical;
  }

  public Double getCylinder() {
    return cylinder;
  }

  public void setCylinder(Double cylinder) {
    this.cylinder = cylinder;
  }

  public Boolean getIsMechanical() {
    return isMechanical;
  }

  public void setIsMechanical(Boolean electric) {
    isMechanical = electric;
  }

  @Override
  public void moveForward() {
    System.out.println("The motorcycle is moving forward");
  }

  @Override
  public void parkVehicle() {
    System.out.println("The Motorcycle has been parked");
  }

  @Override
  public void stopVehicle() {
    System.out.println("The motorcycle has been stopped");
  }
}
