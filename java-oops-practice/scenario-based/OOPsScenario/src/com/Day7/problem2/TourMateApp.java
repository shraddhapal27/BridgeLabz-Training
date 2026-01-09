package com.Day7.problem2;

public class TourMateApp {
    public static void main(String[] args) {

        Transport t1 = new Transport(8000);
        Hotel h1 = new Hotel(12000);
        Activity a1 = new Activity(5000);

        Trip trip1 = new DomesticTrip("Goa", 5, t1, h1, a1);
        trip1.book();
        trip1.showTripDetails();

        System.out.println();

        Transport t2 = new Transport(30000);
        Hotel h2 = new Hotel(40000);
        Activity a2 = new Activity(15000);

        Trip trip2 = new InternationalTrip("Paris", 7, t2, h2, a2);
        trip2.book();
        trip2.showTripDetails();
    }
}
