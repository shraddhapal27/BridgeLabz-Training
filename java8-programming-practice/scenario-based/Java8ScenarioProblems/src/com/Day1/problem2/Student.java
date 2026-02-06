package com.Day1.problem2;


class Student {

    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String city;
    private int rank;
    private String department;
    private String contacts;

    public Student(int id, String firstName, int age, String gender,
                   String city, int rank, String department, String contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.department = department;
        this.contacts = contacts;
    }

    // Getters
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public int getRank() { return rank; }
    public String getDepartment() { return department; }
    public String getContacts() { return contacts; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", department='" + department + '\'' +
                '}';
    }
}