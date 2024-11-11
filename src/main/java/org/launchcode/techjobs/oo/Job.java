package org.launchcode.techjobs.oo;

public class Job extends JobField {
    private final int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    private static String checkIfEmpty(String field) {
        return (field == null || field.trim().isEmpty()) ? "Data not available" : field;
    }

    public static void main(String[] args) {
        Job job = new Job();
        // Set job fields here

        System.out.println(formatJob(job));
    }

    private static boolean formatJob(Job job) {
        return false;
    }


    public Job() {
        this.id = nextId;
        nextId++;
    }

    // Constructor to initialize all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (name == null || name.trim().isEmpty()) {
            name = "Data not available";
        }
        if (employer == null || employer.getValue().isEmpty()) {
            employer = new Employer("Data not available");
        }
        if (location == null || location.getValue().isEmpty()) {
            location = new Location("Data not available");
        }
        if (positionType == null || positionType.getValue().isEmpty()) {
            positionType = new PositionType("Data not available");
        }
        if (coreCompetency == null || coreCompetency.getValue().isEmpty()) {
            coreCompetency = new CoreCompetency("Data not available");
        }
        return System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Employer: " + employer + System.lineSeparator() +
                "Location: " + location + System.lineSeparator() +
                "Position Type: " + positionType + System.lineSeparator() +
                "Core Competency: " + coreCompetency + System.lineSeparator();


    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
