package edu.nwmissouri.zoo05group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test Golf using JUnit5
 *
 * @author s545030
 */
public class GolfTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public GolfTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    }

  /**
   * 
   * @throws Exception 
   */
    @Test
    public void testplayers() throws Exception {
        String expected = "Playing Golf with 2";
        var golf = new Golf("Gayatri", 2);
        golf.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * 
     * @throws Exception 
     */

    @Test
    public void testPlay() throws Exception {
        String expected = "A game played in outdoor areas";
        var golf = new Golf("Gayatri", 2);
        golf.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testSkill() throws Exception {
        String expected = "Strike, Power";
        var golf = new Golf("Gayatri", 2);
        golf.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testRules() throws Exception {
        String expected = "The ball must be hit using standard clubs from the start of each hole to the green and ultimately into the hole, which is marked by a flag.";
        var golf = new Golf("Gayatri", 2);
        golf.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testrScoring() throws Exception {
        String expected = "winner is the player with the lowest total";
        var golf = new Golf("Gayatri", 2);
        golf.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}


