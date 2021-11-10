/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo05group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Golf Group.
 * 
 * @author s545030
 */
public class GolfGroupTest {

    public GolfGroupTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class GolfGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = GolfGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class GolfGroup.
     */
    @Test
    public void testGroupRun() {
        GolfGroup.create();
        GolfGroup.run();
        assertTrue(true);
    }

}
