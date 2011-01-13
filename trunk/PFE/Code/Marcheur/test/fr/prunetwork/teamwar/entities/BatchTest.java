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
public class BatchTest {

    public BatchTest() {
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
     * Test of getName method, of class Batch.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Batch instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTechnology method, of class Batch.
     */
    @Test
    public void testGetTechnology() {
        System.out.println("getTechnology");
        Batch instance = null;
        String expResult = "";
        String result = instance.getTechnology();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTracability method, of class Batch.
     */
    @Test
    public void testAddTracability() {
        System.out.println("addTracability");
        Tracability tracability = null;
        Batch instance = null;
        instance.addTracability(tracability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTracabilitys method, of class Batch.
     */
    @Test
    public void testGetTracabilitys() {
        System.out.println("getTracabilitys");
        Batch instance = null;
        Collection expResult = null;
        Collection result = instance.getTracabilitys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of description method, of class Batch.
     */
    @Test
    public void testDescription() {
        System.out.println("description");
        Batch instance = null;
        String expResult = "";
        String result = instance.description();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simpleFiability method, of class Batch.
     */
    @Test
    public void testSimpleFiability() {
        System.out.println("simpleFiability");
        Batch instance = null;
        double expResult = 0.0;
        double result = instance.simpleFiability();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fiabilityWithQTAndMSL method, of class Batch.
     */
    @Test
    public void testFiabilityWithQTAndMSL() {
        System.out.println("fiabilityWithQTAndMSL");
        MyDate currentDate = null;
        Batch instance = null;
        double expResult = 0.0;
        double result = instance.fiabilityWithQTAndMSL(currentDate);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fiabilityWithQualityTask method, of class Batch.
     */
    @Test
    public void testFiabilityWithQualityTask() {
        System.out.println("fiabilityWithQualityTask");
        MyDate currentDate = null;
        Batch instance = null;
        double expResult = 0.0;
        double result = instance.fiabilityWithQualityTask(currentDate);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fiabilityWithQTAndMSLandWorkstation method, of class Batch.
     */
    @Test
    public void testFiabilityWithQTAndMSLandWorkstation() {
        System.out.println("fiabilityWithQTAndMSLandWorkstation");
        MyDate currentDate = null;
        Batch instance = null;
        double expResult = 0.0;
        double result = instance.fiabilityWithQTAndMSLandWorkstation(currentDate);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}