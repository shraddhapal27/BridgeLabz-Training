package com.Day2.medinventory;

import java.time.LocalDate;
import java.util.Objects;

class Item {
    String id, name, type;
    int quantity;
    LocalDate expiry;

    Item(String id, String name, String type, int quantity, LocalDate expiry) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.expiry = expiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
