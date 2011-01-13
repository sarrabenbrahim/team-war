/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.prunetwork.teamwar.extractor;

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
public class WorkstationExtractorTest {

    public WorkstationExtractorTest() {
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
     * Test of getTracabilitys method, of class WorkstationExtractor.
     */
    @Test
    public void testGetTracabilitys() {
        System.out.println("getTracabilitys");
        WorkstationExtractor instance = null;
        Collection expResult = null;
        Collection result = instance.getTracabilitys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extract method, of class WorkstationExtractor.
     */
    @Test
    public void testExtract() {
        System.out.println("extract");
        WorkstationExtractor instance = null;
        Collection expResult = null;
        Collection result = instance.extract();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}