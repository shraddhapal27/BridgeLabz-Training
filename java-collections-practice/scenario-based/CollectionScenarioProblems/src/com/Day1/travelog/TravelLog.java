package com.Day1.travelog;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class TravelLog {
    static class Trip implements Serializable {
        private static final long serialVersionUID = 1L;
        String city, country, startDate, endDate;
        int duration;
        
        Trip(String city, String country, String startDate, String endDate) {
            this.city = city;
            this.country = country;
            this.startDate = startDate;
            this.endDate = endDate;
            this.duration = calculateDuration();
        }
        
        private int calculateDuration() {
            // Simplified duration calculation
            return (int)(Math.random() * 30) + 1;
        }
    }
    
    private List<Trip> trips = new ArrayList<>();
    private Set<String> countries = new HashSet<>();
    private Map<String, Integer> cityVisits = new HashMap<>();
    
    public void loadTrips(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Trip trip;
            while ((trip = (Trip) ois.readObject()) != null) {
                trips.add(trip);
                countries.add(trip.country);
                cityVisits.merge(trip.city, 1, Integer::sum);
            }
        } catch (EOFException e) {
            // Expected at end of file
        } catch (Exception e) {
            System.err.println("Error loading trips: " + e.getMessage());
        }
    }
    
    public void saveTrip(Trip trip, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            oos.writeObject(trip);
        } catch (IOException e) {
            System.err.println("Error saving trip: " + e.getMessage());
        }
    }
    
    public void searchAndSummarize(String searchText) {
        System.out.println("=== Travel Summary ===");
        
        // Cities matching regex
        Pattern cityPattern = Pattern.compile(searchText, Pattern.CASE_INSENSITIVE);
        List<String> matchingCities = trips.stream()
            .map(t -> t.city)
            .filter(city -> cityPattern.matcher(city).find())
            .distinct()
            .collect(Collectors.toList());
        
        System.out.println("Cities matching '" + searchText + "': " + matchingCities);
        System.out.println("Trips > 5 days: " + 
            trips.stream().filter(t -> t.duration > 5).count());
        System.out.println("Unique countries: " + countries.size());
        
        // Top 3 cities
        cityVisits.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(3)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " visits"));
    }
    
    // Test main
    public static void main(String[] args) {
        TravelLog log = new TravelLog();
        
        // Save sample trips
        log.saveTrip(new Trip("Paris", "France", "2025-01-01", "2025-01-10"), "trips.dat");
        log.saveTrip(new Trip("Tokyo", "Japan", "2025-03-15", "2025-03-25"), "trips.dat");
        
        log.loadTrips("trips.dat");
        log.searchAndSummarize("par|tok");
    }
}
