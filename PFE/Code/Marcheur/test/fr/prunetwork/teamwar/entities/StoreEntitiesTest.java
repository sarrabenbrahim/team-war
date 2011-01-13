/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.prunetwork.teamwar.entities;

import fr.prunetwork.teamwar.utilities.MyDate;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabiengarcia
 */
public class StoreEntitiesTest {

    public StoreEntitiesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addAllBatch method, of class StoreEntities.
     */
    @Test
    public void testAddAllBatch() {
        System.out.println("addAllBatch");
        Collection<Batch> batches = null;
        StoreEntities.addAllBatch(batches);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAllWorkstation method, of class StoreEntities.
     */
    @Test
    public void testAddAllWorkstation() {
        System.out.println("addAllWorkstation");
        Collection<Workstation> workstations = null;
        StoreEntities.addAllWorkstation(workstations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBatch method, of class StoreEntities.
     */
    @Test
    public void testGetBatch() {
        System.out.println("getBatch");
        String name = "";
        Batch expResult = null;
        Batch result = StoreEntities.getBatch(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkstation method, of class StoreEntities.
     */
    @Test
    public void testGetWorkstation() {
        System.out.println("getWorkstation");
        String name = "";
        Workstation expResult = null;
        Workstation result = StoreEntities.getWorkstation(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAllTracability method, of class StoreEntities.
     */
    @Test
    public void testAddAllTracability() {
        System.out.println("addAllTracability");
        Collection<Tracability> tracabilitys = null;
        StoreEntities.addAllTracability(tracabilitys);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastDate method, of class StoreEntities.
     */
    @Test
    public void testGetLastDate() {
        System.out.println("getLastDate");
        MyDate expResult = null;
        MyDate result = StoreEntities.getLastDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstDate method, of class StoreEntities.
     */
    @Test
    public void testGetFirstDate() {
        System.out.println("getFirstDate");
        MyDate expResult = null;
        MyDate result = StoreEntities.getFirstDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}