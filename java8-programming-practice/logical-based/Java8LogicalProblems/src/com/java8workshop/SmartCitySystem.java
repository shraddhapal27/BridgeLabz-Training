package com.java8workshop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 30, "08:00", 40),
                new MetroService("A-C", 50, "07:30", 120),
                new TaxiService("B-D", 120, "08:15", 2),
                new BusService("A-B", 25, "09:00", 35),
                new AmbulanceService()
        );

        FareCalculator fareCalculator =
                (baseFare, passengers) -> baseFare * passengers;

        System.out.println("🔍 Filter & Sort (Lambda):");
        services.stream()
                .filter(s -> s.getFare() > 0)
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n📊 Live Dashboard:");
        services.forEach(TransportService::printServiceDetails);

        System.out.println("\n🛣 Group by Route:");
        services.stream()
                .collect(Collectors.groupingBy(TransportService::getRoute))
                .forEach((r, s) ->
                        System.out.println(r + " → " + s.size() + " services"));

        System.out.println("\n⏰ Peak vs Non-Peak:");
        services.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.getDepartureTime().compareTo("09:00") <= 0))
                .forEach((k, v) ->
                        System.out.println((k ? "Peak" : "Non-Peak") + " → " + v.size()));

        System.out.println("\n💰 Revenue Summary:");
        DoubleSummaryStatistics stats =
                services.stream()
                        .collect(Collectors.summarizingDouble(
                                s -> fareCalculator.calculateFare(
                                        s.getFare(), s.getPassengers())));
        System.out.println(stats);

        System.out.println("\n🚨 Emergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                        System.out.println(s.getServiceName() + " gets priority"));

        System.out.println("\n📍 Distance Utility:");
        System.out.println("Distance: " +
                GeoUtils.calculateDistance(12.9, 77.5, 13.0, 77.6));
    }
}
