package com.streamapi.problem1;

import java.util.List;

public class MovieDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("Movie A", 8.7, 2025),
            new Movie("Movie B", 9.2, 2026),
            new Movie("Movie C", 7.8, 2024),
            new Movie("Movie D", 9.0, 2025),
            new Movie("Movie E", 8.5, 2026),
            new Movie("Movie F", 9.1, 2025),
            new Movie("Movie G", 8.3, 2026)
        );

        // Task: Find top 5 trending movies
        movies.stream()
            // Optional: filter movies released in 2025 or later
            .filter(m -> m.getReleaseYear() >= 2025)
            // Sort first by rating descending, then by release year descending
            .sorted((m1, m2) -> {
                int ratingCompare = Double.compare(m2.getRating(), m1.getRating());
                if (ratingCompare != 0) return ratingCompare;
                return Integer.compare(m2.getReleaseYear(), m1.getReleaseYear());
            })
            .limit(5)
            .forEach(System.out::println);
    }
}

