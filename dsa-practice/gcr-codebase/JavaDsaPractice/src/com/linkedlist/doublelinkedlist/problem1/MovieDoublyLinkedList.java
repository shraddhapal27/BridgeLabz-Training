package com.linkedlist.doublelinkedlist.problem1;


class MovieDoublyLinkedList {
    MovieNode head, tail;

    void addAtBeginning(String t, String d, int y, double r) {
        MovieNode n = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        System.out.println("Movie added at beginning");
    }

    void addAtEnd(String t, String d, int y, double r) {
        MovieNode n = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        System.out.println("Movie added at end");
    }

    void addAtPosition(int pos, String t, String d, int y, double r) {
        if (pos == 1) {
            addAtBeginning(t, d, y, r);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(t, d, y, r);
            return;
        }

        MovieNode n = new MovieNode(t, d, y, r);
        n.next = temp.next;
        n.prev = temp;
        temp.next.prev = n;
        temp.next = n;

        System.out.println("Movie added at position " + pos);
    }

    void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for this director");
    }

    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with this rating");
    }

    void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    void displayForward() {
        MovieNode temp = head;
        if (temp == null) {
            System.out.println("No movie records");
            return;
        }
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        if (temp == null) {
            System.out.println("No movie records");
            return;
        }
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    void displayMovie(MovieNode m) {
        System.out.println(
            "Title: " + m.title +
            ", Director: " + m.director +
            ", Year: " + m.year +
            ", Rating: " + m.rating
        );
    }
}
