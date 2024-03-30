package edu.neu.mgen;

public class Ship extends Vehicle {
   private double displacement;

   public Ship(String name, double speed, double displacement) {
      super(name, speed);
      this.displacement = displacement;
   }

   public void displayDetails() {
      System.out.println("Ship Name: " + name + ", Speed: " + speed + "mph, Displacement: " + displacement + "tons");
   }
}