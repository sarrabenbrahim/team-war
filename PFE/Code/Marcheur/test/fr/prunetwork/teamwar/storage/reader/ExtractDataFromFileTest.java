/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.prunetwork.teamwar.storage.reader;

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
public class ExtractDataFromFileTest {

    public ExtractDataFromFileTest() {
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
     * Test of createTracabilityCollection method, of class ExtractDataFromFile.
     */
    @Test
    public void testCreateTracabilityCollection() {
        System.out.println("createTracabilityCollection");
        String fichier = "";
        Collection expResult = null;
        Collection result = ExtractDataFromFile.createTracabilityCollection(fichier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}