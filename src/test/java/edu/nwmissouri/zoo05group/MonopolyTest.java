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
public class MonopolyTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public MonopolyTest() {
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
        String expected = "Playing Monopoly with 6";
        var monopoly = new Monopoly("Gayatri", 6);
        monopoly.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * 
     * @throws Exception 
     */

    @Test
    public void testPlay() throws Exception {
        String expected = "A game played with the two to six members";
        var monopoly = new Monopoly("Gayatri", 2);
        monopoly.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testSkill() throws Exception {
        String expected = "Active mind and some business skills";
        var monopoly = new Monopoly("Gayatri", 2);
        monopoly.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testRules() throws Exception {
        String expected = "1. Each player chooses one token to represent them while traveling around the board \n 2.Each player is given $1500 \n 3. Select someone as banker. If this person also plays, then he must keep his personal funds \n 4. Then each player places his token on the corner marked GO and throw the dice and move his the number of spaces indicated by the dice.";
        var monopoly = new Monopoly("Gayatri", 2);
        monopoly.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testrScoring() throws Exception {
        String expected = "Person with highest amount wins";
        var monopoly = new Monopoly("Gayatri", 2);
        monopoly.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}


