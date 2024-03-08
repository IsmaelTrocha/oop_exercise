package oop.workshop.app.domain.services.vehicle;

import oop.workshop.app.domain.model.Vehicle;

/*
* Este es una interfaz la cual esta cumpliendo con un patron de diseño llamado
* Factory Method, el cual es un patrón creacional que nos permite manejar
* Una correcta creación de objetos especificos.
* */
public interface VehicleFactory <T extends Vehicle>{

  T createVehicle();

}
