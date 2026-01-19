package com.Day11.problem2;

class Ball {

    private int id;
    private String color;
    private String size; // small / medium / large

    public Ball(int id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ball{id=" + id + ", color=" + color + ", size=" + size + "}";
    }
}

