package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private final int id;
    private final String value;
//    public JobField() {
//    }

    public JobField() {
        // Initialize with default values
        // For instance, this might auto-generate IDs based on a static counter or some other logic
        this.id = generateId();
        this.value = "";
    }

    public JobField(String value) {
        this.id = generateId();
        this.value = value;
    }

    private int generateId() {
        return 0;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    @Override
    public String toString() {
        return value;
    }

}






















