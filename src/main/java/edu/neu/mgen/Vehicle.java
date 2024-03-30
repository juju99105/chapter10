package edu.neu.mgen;

public abstract class Vehicle {
   protected String name;
   protected double speed; // in miles per hour for simplicity

   public Vehicle(String name, double speed) {
      this.name = name;
      this.speed = speed;
   }

   // Abstract method to display vehicle details
   public abstract void displayDetails();
}