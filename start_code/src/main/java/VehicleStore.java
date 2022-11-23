import products.Product;
import vehicles.*;
import vehicles.air.Helicopter;
import vehicles.air.Plane;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Kayak;
import vehicles.water.Speedboat;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...
        Kayak kayak = new Kayak(11, 21, new Product("Kaya", 450, 7));
        vehicles.add(kayak);

        System.out.println(kayak.getHullType());
        System.out.println(kayak.getTitle());
        System.out.println(kayak.getInventory());

        Speedboat speedboat = new Speedboat(201, 121, new Product("Zoomer", 20000, 4),
        new Motor(101,151));
        vehicles.add(speedboat);
        speedboat.startEngine();

        System.out.println(speedboat.getFuel());
        System.out.println(speedboat.getPrice());

        Plane plane = new Plane(500, 200, new Product("airbus", 900000, 1),
                new Engine(99, 125), new Radar());
        vehicles.add(plane);

        plane.startEngine();
        plane.startScan();
        System.out.println(plane.getMaximumAltitude());

        Helicopter helicopter = new Helicopter(200, 120, new Product("2019 Midnight Copter", 250000, 5),
                new Engine(100, 150), new Radar());
        vehicles.add(helicopter);

        helicopter.startEngine();
        helicopter.startScan();
        System.out.println(helicopter.getMaximumAltitude());
    }
}
