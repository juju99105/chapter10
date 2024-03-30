package edu.neu.mgen;

public class demo {
   public static void main(String[] args) {
      Vehicle car = new Car("Tesla Model S", 155, 5);
      Vehicle motorbike = new Motorbike("Harley Davidson", 120, false);
      Vehicle aircraft = new Aircraft("Boeing 747", 570, 35000);
      Vehicle ship = new Ship("Titanic", 24, 52310);

      car.displayDetails();
      motorbike.displayDetails();
      aircraft.displayDetails();
      ship.displayDetails();
   }
}