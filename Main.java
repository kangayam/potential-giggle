package com.get.flight;

// Example of using variable number of parameters in method overloading
// Inheritance example
public class Main {

    public static void main(String[] args) {

	Flight f = new Flight();
	f.add1Passenger();
//	System.out.print("Flight Seats :");
//	System.out.println(f.seats);

        CargoFlight cf = new CargoFlight();
        Flight f2 = new CargoFlight();
        f2.Display();
//        System.out.print("Cargo Seats :");
//        System.out.println (cf.seats);

        //cf.DisplayCargo();

    }
}
