package com.streamapi.problem2;

import java.util.List;

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = List.of(
            new Doctor("Dr. Alice", "Cardiology", true),
            new Doctor("Dr. Bob", "Neurology", false),
            new Doctor("Dr. Carol", "Orthopedics", true),
            new Doctor("Dr. David", "Cardiology", true)
        );

        doctors.stream()
               .filter(d -> d.availableOnWeekend)
               .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))
               .forEach(System.out::println);
    }
}
//
//4️⃣ Transforming Names for Display
//import java.util.List;
//
//public class NameTransform {
//    public static void main(String[] args) {
//        List<String> names = List.of("alice", "bob", "carol", "david");
//
//        names.stream()
//             .map(String::toUpperCase)
//             .sorted()
//             .forEach(System.out::println);
//    }
//}
//
//
//Output
//
//ALICE
//BOB
//CAROL
//DAVID
//
//forEach() Method Examples
//1️⃣ Stock Price Logger
//import java.util.List;
//
//public class StockLogger {
//    public static void main(String[] args) {
//        List<Double> prices = List.of(101.5, 102.3, 100.8);
//
//        prices.forEach(price -> System.out.println("Stock Price: ₹" + price));
//    }
//}
//
//2️⃣ Event Attendee Welcome Message
//import java.util.List;
//
//public class WelcomeAttendees {
//    public static void main(String[] args) {
//        List<String> attendees = List.of("Alice", "Bob", "Carol");
//
//        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
//    }
//}
//
//3️⃣ IoT Sensor Readings
//import java.util.List;
//
//public class SensorReadings {
//    public static void main(String[] args) {
//        List<Double> readings = List.of(23.5, 27.8, 19.2);
//        double threshold = 25.0;
//
//        readings.stream()
//                .filter(r -> r > threshold)
//                .forEach(r -> System.out.println("Alert! Reading above threshold: " + r));
//    }
//}
//
//4️⃣ Email Notifications
//import java.util.List;
//
//public class EmailNotification {
//    public static void sendEmailNotification(String email) {
//        System.out.println("Sent email to: " + email);
//    }
//
//    public static void main(String[] args) {
//        List<String> emails = List.of("alice@example.com", "bob@example.com");
//
//        emails.forEach(email -> sendEmailNotification(email));
//    }
//}
//
//5️⃣ Logging Transactions
//import java.time.LocalDateTime;
//import java.util.List;
//
//public class TransactionLogger {
//    public static void main(String[] args) {
//        List<String> transactionIds = List.of("TXN1001", "TXN1002", "TXN1003");
//
//        transactionIds.forEach(id -> 
//            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
//        );
//    }
//}