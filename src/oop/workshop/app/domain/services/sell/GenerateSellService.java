package oop.workshop.app.domain.services.sell;

import oop.workshop.app.domain.model.Vehicle;
import oop.workshop.app.domain.model.VehicleSell;

public interface GenerateSellService {

  String generateVehicleSell(Vehicle vehicle);
}
