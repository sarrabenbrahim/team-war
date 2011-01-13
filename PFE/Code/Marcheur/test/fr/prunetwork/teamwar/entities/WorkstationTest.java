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
public class WorkstationTest {

    public WorkstationTest() {
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
     * Test of getDisturbanceOfWorkStation method, of class Workstation.
     */
    @Test
    public void testGetDisturbanceOfWorkStation() {
        System.out.println("getDisturbanceOfWorkStation");
        Workstation instance = null;
        double expResult = 0.0;
        double result = instance.getDisturbanceOfWorkStation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisturbanceOfWorkStation method, of class Workstation.
     */
    @Test
    public void testSetDisturbanceOfWorkStation() {
        System.out.println("setDisturbanceOfWorkStation");
        double disturbanceOfWorkStation = 0.0;
        Workstation instance = null;
        instance.setDisturbanceOfWorkStation(disturbanceOfWorkStation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTracability method, of class Workstation.
     */
    @Test
    public void testAddTracability() {
        System.out.println("addTracability");
        Tracability tracability = null;
        Workstation instance = null;
        instance.addTracability(tracability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTracabilitys method, of class Workstation.
     */
    @Test
    public void testGetTracabilitys() {
        System.out.println("getTracabilitys");
        Workstation instance = null;
        Collection expResult = null;
        Collection result = instance.getTracabilitys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Workstation.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Workstation instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of description method, of class Workstation.
     */
    @Test
    public void testDescription() {
        System.out.println("description");
        Workstation instance = null;
        String expResult = "";
        String result = instance.description();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiabilityRandomLaw method, of class Workstation.
     */
    @Test
    public void testGetFiabilityRandomLaw() {
        System.out.println("getFiabilityRandomLaw");
        Workstation instance = null;
        double expResult = 0.0;
        double result = instance.getFiabilityRandomLaw();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiabilityQualityTask method, of class Workstation.
     */
    @Test
    public void testGetFiabilityQualityTask() {
        System.out.println("getFiabilityQualityTask");
        MyDate currentDate = null;
        Workstation instance = null;
        double expResult = 0.0;
        double result = instance.getFiabilityQualityTask(currentDate);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiabilityQualityTaskAndMSL method, of class Workstation.
     */
    @Test
    public void testGetFiabilityQualityTaskAndMSL() {
        System.out.println("getFiabilityQualityTaskAndMSL");
        MyDate currentDate = null;
        Workstation instance = null;
        double expResult = 0.0;
        double result = instance.getFiabilityQualityTaskAndMSL(currentDate);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastControleMSE method, of class Workstation.
     */
    @Test
    public void testSetLastControleMSE() {
        System.out.println("setLastControleMSE");
        MyDate lastControleMSE = null;
        Workstation instance = null;
        instance.setLastControleMSE(lastControleMSE);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastControleMSE method, of class Workstation.
     */
    @Test
    public void testGetLastControleMSE() {
        System.out.println("getLastControleMSE");
        Workstation instance = null;
        MyDate expResult = null;
        MyDate result = instance.getLastControleMSE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}