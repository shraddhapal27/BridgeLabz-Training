package com.Day5.problem4;

class User {
    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void showUserDetails() {
        System.out.println("Organizer: " + name + " | Email: " + email + " | Phone: " + phone);
    }
}