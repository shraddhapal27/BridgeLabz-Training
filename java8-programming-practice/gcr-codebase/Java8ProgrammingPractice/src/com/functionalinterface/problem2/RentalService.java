package com.functionalinterface.problem2;
import java.util.List;

public class RentalService {
    public static void main(String[] args) {
        List<Rentable> vehicles = List.of(
                new Car(),
                new Bike(),
                new Bus()
        );

        vehicles.forEach(Rentable::rent);
        vehicles.forEach(Rentable::returnVehicle);
    }
}
