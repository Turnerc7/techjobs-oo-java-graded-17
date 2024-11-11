package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    private final int id;
    private static int nextId = 1;
    private String value;

    public Location() {
        id = nextId;
        nextId++;
    }


    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.


    // Custom toString, equals, and hashCode methods:

    public Location(int id, String value) {
        this.id = id;
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location)) return false;
        return getId() == location.getId();
    }

    public Location(String value) {
        this();
        this.value = Objects.requireNonNull(value, "Location cannot be null");
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }


}
