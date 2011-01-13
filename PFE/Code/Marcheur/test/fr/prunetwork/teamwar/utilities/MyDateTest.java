/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.prunetwork.teamwar.utilities;

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
public class MyDateTest {

    public MyDateTest() {
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
     * Test of setMyDate method, of class MyDate.
     */
    @Test
    public void testSetMyDate() throws Exception {
        System.out.println("setMyDate");
        String date = "20100925063000";
        MyDate dateAttempt = new MyDate();
        dateAttempt.setYear(2010);
        dateAttempt.setMonth(9);
        dateAttempt.setDate(25);
        dateAttempt.setHours(6);
        dateAttempt.setMinutes(30);
        dateAttempt.setSeconds(0);
        MyDate instance = new MyDate(date);
        System.out.println(instance.toString());
        System.out.println(dateAttempt.toString());

        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.toString().equalsIgnoreCase(dateAttempt.toString()));
    }

    /**
     * Test of toString method, of class MyDate.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MyDate instance = new MyDate();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
