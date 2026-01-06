package com.Day5.problem4;

public class EventEaseApp {
    public static void main(String[] args) {
        User organizer = new User("Alice", "alice@email.com", "123-456-7890");

        Event birthday = new BirthdayEvent("Alice's Birthday", "Beach Resort", "2026-02-14", 50,
                                           2000, 500, 100);
        Event conference = new ConferenceEvent("Tech Conference", "City Hall", "2026-03-10", 200,
                                               5000, 1500, 200);

        // Show organizer
        organizer.showUserDetails();

        // Schedule events (polymorphism in action)
        birthday.schedule();
        conference.schedule();

        // Reschedule and cancel examples
        birthday.reschedule("2026-02-15");
        conference.cancel();

        // Display details
        birthday.showEventDetails();
        conference.showEventDetails();
    }
}