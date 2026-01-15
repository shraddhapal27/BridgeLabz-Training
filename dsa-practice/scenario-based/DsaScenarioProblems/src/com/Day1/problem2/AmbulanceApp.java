package com.Day1.problem2;

public class AmbulanceApp {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        route.findNearestAvailableUnit();

        route.removeUnit("Radiology");

        route.displayUnits();
    }
}
]