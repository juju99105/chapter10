package edu.neu.mgen;

public class Motorbike extends Vehicle {
   private boolean hasSidecar;

   public Motorbike(String name, double speed, boolean hasSidecar) {
      super(name, speed);
      this.hasSidecar = hasSidecar;
   }

   public void displayDetails() {
      System.out.println("Motorbike Name: " + name + ", Speed: " + speed + "mph, Has Sidecar: " + hasSidecar);
   }
}