package ca.etsmtl.log430.lab1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ResourceListTest {

    @Test
    public void testAddResource() throws Exception
    {
        Resource resource1 = new Resource();
        resource1.setID("RES01");
        resource1.setFirstName("FirstName");
        resource1.setLastName("LastName");
        resource1.setRole("ADM");

        Resource resource2 = new Resource();
        resource2.setID("RES02");
        resource2.setFirstName("Bonjour");
        resource2.setLastName("Bye");
        resource2.setRole("REN");

        ResourceList resourceList = new ResourceList();
        resourceList.addResource(resource1);
        resourceList.addResource(resource2);

        resourceList.goToFrontOfList();
        Resource resourceListFirstItem = resourceList.getNextResource();
        Resource resourceListSecondItem = resourceList.getNextResource();

        assertEquals(2, resourceList.count());

        assertEquals("RES01", resourceListFirstItem.getID());
        assertEquals("FirstName", resourceListFirstItem.getFirstName());
        assertEquals("LastName", resourceListFirstItem.getLastName());
        assertEquals("ADM", resourceListFirstItem.getRole());

        assertEquals("RES02", resourceListSecondItem.getID());
        assertEquals("Bonjour", resourceListSecondItem.getFirstName());
        assertEquals("Bye", resourceListSecondItem.getLastName());
        assertEquals("REN", resourceListSecondItem.getRole());
    }

    @Test
    public void testGetNextResource() throws Exception
    {
        Resource resource1 = new Resource();
        resource1.setID("RES01");
        resource1.setFirstName("FirstName");
        resource1.setLastName("LastName");
        resource1.setRole("ADM");

        Resource resource2 = new Resource();
        resource2.setID("RES02");
        resource2.setFirstName("Bonjour");
        resource2.setLastName("Bye");
        resource2.setRole("REN");

        ResourceList resourceList = new ResourceList();
        resourceList.addResource(resource1);
        resourceList.addResource(resource2);

        resourceList.goToFrontOfList();
        Resource resourceListFirstItem = resourceList.getNextResource();
        Resource resourceListSecondItem = resourceList.getNextResource();

        assertEquals(2, resourceList.count());

        assertEquals("RES01", resourceListFirstItem.getID());
        assertEquals("FirstName", resourceListFirstItem.getFirstName());
        assertEquals("LastName", resourceListFirstItem.getLastName());
        assertEquals("ADM", resourceListFirstItem.getRole());

        assertEquals("RES02", resourceListSecondItem.getID());
        assertEquals("Bonjour", resourceListSecondItem.getFirstName());
        assertEquals("Bye", resourceListSecondItem.getLastName());
        assertEquals("REN", resourceListSecondItem.getRole());
    }

    @Test
    public void testFindResource() throws Exception
    {
        Resource resource1 = new Resource();
        resource1.setID("RES01");
        resource1.setFirstName("FirstName");
        resource1.setLastName("LastName");
        resource1.setRole("ADM");

        Resource resource2 = new Resource();
        resource2.setID("RES02");
        resource2.setFirstName("Bonjour");
        resource2.setLastName("Bye");
        resource2.setRole("REN");


        Resource resource3 = new Resource();
        resource3.setID("RES03");
        resource3.setFirstName("Gislain");
        resource3.setLastName("Armand");
        resource3.setRole("MST");

        ResourceList resourceList = new ResourceList();
        resourceList.addResource(resource1);
        resourceList.addResource(resource2);
        resourceList.addResource(resource3);

        boolean found = resourceList.findResource(resource2);

        assertEquals(3, resourceList.count());
        assertTrue(found);
        assertEquals(2, resourceList.vectorIndex);
    }

    @Test
    public void testFindResourceByID() throws Exception
    {
        Resource resource1 = new Resource();
        resource1.setID("RES01");
        resource1.setFirstName("FirstName");
        resource1.setLastName("LastName");
        resource1.setRole("ADM");

        Resource resource2 = new Resource();
        resource2.setID("RES02");
        resource2.setFirstName("Bonjour");
        resource2.setLastName("Bye");
        resource2.setRole("REN");

        Resource resource3 = new Resource();
        resource3.setID("RES03");
        resource3.setFirstName("Gislain");
        resource3.setLastName("Armand");
        resource3.setRole("MST");

        ResourceList resourceList = new ResourceList();
        resourceList.addResource(resource1);
        resourceList.addResource(resource2);
        resourceList.addResource(resource3);

        Resource returnedResource = resourceList.findResourceByID("RES02");

        assertEquals(3, resourceList.count());
        assertEquals(2, resourceList.vectorIndex);

        assertEquals("RES02", returnedResource.getID());
        assertEquals("Bonjour", returnedResource.getFirstName());
        assertEquals("Bye", returnedResource.getLastName());
        assertEquals("REN", returnedResource.getRole());

    }
}