package edu.neu.mgen;

public class Aircraft extends Vehicle {
   private double altitude;

   public Aircraft(String name, double speed, double altitude) {
      super(name, speed);
      this.altitude = altitude;
   }

   public void displayDetails() {
      System.out.println("Aircraft Name: " + name + ", Speed: " + speed + "mph, Altitude: " + altitude + "ft");
   }
}