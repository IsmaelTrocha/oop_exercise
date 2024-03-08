package oop.workshop.app.infrastructure.adapter.vehiclesell;

import oop.workshop.app.domain.model.Vehicle;
import oop.workshop.app.domain.services.sell.GenerateSellService;

public class VehicleSellAdapter implements GenerateSellService {

  @Override
  public String generateVehicleSell(Vehicle vehicle) {
    return "Vehiculo con la placa: ".concat(vehicle.getPlate()) + " fue vendido.";
  }
}
