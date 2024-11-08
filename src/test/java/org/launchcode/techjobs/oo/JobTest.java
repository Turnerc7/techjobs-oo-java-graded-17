package org.launchcode.techjobs.oo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        int initialJobId1 = job1.getId();
        int initialJobId2 = job2.getId();
        Assertions.assertNotEquals(0, initialJobId1);
        Assertions.assertNotEquals(0, initialJobId2);
    }
    @Test
public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester",
                  new Employer("ACME"),
                  new Location("Desert"),
                  new PositionType("Quality control"),
                  new CoreCompetency("Persistence"));

    Assertions.assertEquals("Product tester", job.getName());
    Assertions.assertEquals("ACME", job.getEmployer().getValue());
    Assertions.assertEquals("Desert", job.getLocation().getValue());
    Assertions.assertEquals("Quality control", job.getPositionType().getValue());
    Assertions.assertEquals("Persistence", job.getCoreCompetency().getValue());
}

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Assertions.assertNotEquals(job1, job2);

    }
@Test public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        int length = job1.toString().length();
        assertEquals(job1.toString().substring(0,1), System.lineSeparator());
    assertEquals(job1.toString().substring(length-2, length), System.lineSeparator());
}
    @Test public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
String[] jobArray = job1.toString().split(System.lineSeparator());
assertEquals(jobArray[1], "ID: " + job1.getId());
        assertEquals(jobArray[2], "Name: Product tester");
        assertEquals(jobArray[3], "Employer: ACME");
        assertEquals(jobArray[4], "Location: Desert");
        assertEquals(jobArray[5], "Position Type: Quality control");
        assertEquals(jobArray[6], "Core Competency: Persistence");
    }
@Test public void testToStringHandlesEmptyField() {
        Job job1 = new Job();
    String[] jobArray = job1.toString().split(System.lineSeparator());
    assertEquals(jobArray[1], "ID: " + job1.getId());
    assertEquals(jobArray[2], "Name: Data not available");
    assertEquals(jobArray[3], "Employer: Data not available");
    assertEquals(jobArray[4], "Location: Data not available");
    assertEquals(jobArray[5], "Position Type: Data not available");
    assertEquals(jobArray[6], "Core Competency: Data not available");
}
}



