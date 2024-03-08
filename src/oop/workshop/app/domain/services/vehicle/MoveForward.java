package oop.workshop.app.domain.services.vehicle;

  /*
   *
   * Como pueden ver, todas las interfaces estan conteniendo solo un metodo dentro.
   * Esto nos permite implementar un principio solido el cual se llama Interface Segregation
   * y con el también se obtiene escalabilidad y simplicidad en nuestro proyecto,
   * evitando así implementar metodos que no necesitamos en nuestras clases.
   *
   */
public interface MoveForward {
   void moveForward();
}
