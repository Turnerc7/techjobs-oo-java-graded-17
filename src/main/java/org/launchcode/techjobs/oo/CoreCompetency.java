package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField {

    private static int nextId = 1;
    private final int id;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    public static int getNextId() {
        return nextId;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency that)) return false;
        return id == that.id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}


// Custom toString, equals, and hashCode methods:


//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public static void setNextId(int nextId) {
//        CoreCompetency.nextId = nextId;
//    }

// TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
//  ONLY a getter for the 'id' field.


