package org.launchcode.techjobs.oo;

public class Employer extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return getId() == employer.getId();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    public int getId() {
        return id;
    }


    public void setValue(String value) {
        this.value = value;
    }
}


