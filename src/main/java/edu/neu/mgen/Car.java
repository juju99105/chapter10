package edu.neu.mgen;

public class Car extends Vehicle {
   private int seats;

   public Car(String name, double speed, int seats) {
      super(name, speed);
      this.seats = seats;
   }

   public void displayDetails() {
      System.out.println("Car Name: " + name + ", Speed: " + speed + "mph, Seats: " + seats);
   }
}