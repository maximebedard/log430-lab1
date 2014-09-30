package ca.etsmtl.log430.lab1;

import ca.etsmtl.log430.lab1.donnees.Project;
import ca.etsmtl.log430.lab1.donnees.Resource;
    /*
import org.junit.Test;

import static org.junit.Assert.*;        */

public class ResourceTest {
   /*
    @Test
    public void testAssignProject() throws Exception {


    }

    @Test
    public void testSetLastName() throws Exception {

    }

    @Test
    public void testGetLastName() throws Exception {

    }

    @Test
    public void testSetFirstName() throws Exception {

    }

    @Test
    public void testGetFirstName() throws Exception {

    }

    @Test
    public void testSetID() throws Exception {

    }

    @Test
    public void testGetID() throws Exception {

    }

    @Test
    public void testSetRole() throws Exception {

    }

    @Test
    public void testGetRole() throws Exception {

    }

    @Test
    public void testSetPreviouslyAssignedProjectList() throws Exception {

    }

    @Test
    public void testGetPreviouslyAssignedProjectList() throws Exception {

    }

    @Test
    public void testSetProjectsAssigned() throws Exception {

    }

    @Test
    public void testGetProjectsAssigned() throws Exception {

    }

    @Test
    public void testCanAcceptMoreWork() throws Exception {

        //Ressource with no assigned projects attempt to take 4 'L', non-expired projects

        Resource r1 = new Resource();
        r1.setID("r1");
        r1.setFirstName("r1");
        r1.setLastName("r1");

        Project p1 = new Project();
        p1.setID("p1");
        p1.setPriority("L");
        p1.setStartDate("2000-12-20");
        p1.setEndDate("2099-12-20");

        Project p2 = new Project();
        p2.setID("p2");
        p2.setPriority("L");
        p2.setStartDate("2000-12-20");
        p2.setEndDate("2099-12-20");

        Project p3 = new Project();
        p3.setID("p3");
        p3.setPriority("L");
        p3.setStartDate("2000-12-20");
        p3.setEndDate("2099-12-20");

        Project p4 = new Project();
        p4.setID("p4");
        p4.setPriority("L");
        p4.setStartDate("2000-12-20");
        p4.setEndDate("2099-12-20");

        Project p5 = new Project();
        p5.setID("p5");
        p5.setPriority("L");
        p5.setStartDate("2000-12-20");
        p5.setEndDate("2099-12-20");

        if(r1.canAcceptMoreWork(p1)){
            p1.assignResource(r1);
            r1.assignProject(p1);
        }  else{
          fail("Cannot give r1 project p1. That's not normal!");
        }

        if(r1.canAcceptMoreWork(p2)){
            p2.assignResource(r1);
            r1.assignProject(p2);
        } else {
            fail("Cannot give r1 project p2. That's not normal!");
        }

        if(r1.canAcceptMoreWork(p3)){
            p3.assignResource(r1);
            r1.assignProject(p3);
        }  else {
            fail("Cannot give r1 project p3. That's not normal!");
        }

        if(r1.canAcceptMoreWork(p4)){
            p4.assignResource(r1);
            r1.assignProject(p4);
        }  else {
            fail("Cannot give r1 project p4. That's not normal!");
        }


        if(r1.canAcceptMoreWork(p5)){
            fail("r1 should not be able to accept p5!");
        }

        //r2

    }  */
}