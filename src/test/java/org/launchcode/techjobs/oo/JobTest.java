package org.launchcode.techjobs.oo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
}


