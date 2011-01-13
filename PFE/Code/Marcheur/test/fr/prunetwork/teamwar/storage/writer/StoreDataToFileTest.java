/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.prunetwork.teamwar.storage.writer;

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
public class StoreDataToFileTest {

    public StoreDataToFileTest() {
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
     * Test of add method, of class StoreDataToFile.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String chaine = "";
        StoreDataToFile instance = null;
        instance.add(chaine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuffer method, of class StoreDataToFile.
     */
    @Test
    public void testGetBuffer() {
        System.out.println("getBuffer");
        StoreDataToFile instance = null;
        String expResult = "";
        String result = instance.getBuffer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StoreDataToFile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StoreDataToFile instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of commit method, of class StoreDataToFile.
     */
    @Test
    public void testCommit() throws Exception {
        System.out.println("commit");
        StoreDataToFile instance = null;
        instance.commit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}