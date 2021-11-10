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
 * Test ScavengerHunt using JUnit5
 *
 * @author s545040
 */
public class ScavengerHuntTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ScavengerHuntTest() {
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
     * Test of game method, of class Bingo.
     *
     * @throws Exception
     */
//    @Test
//    public void testgame() throws Exception {
//        String expected = "I Like to play Bingo.";
//        var bingo = new Bingo("Satheesh", 2);
//        bingo.game();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }

    /**
     * Test of players method, of class Bingo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testplayers() throws Exception {
        String expected = "Playing scavengerHunt with 2 players";
        var scavengerHunt = new ScavengerHunt("SaiKrishna", 2);
        scavengerHunt.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class Bingo.
     *
     * @throws Exception
     */
    @Test
    public void testPlay() throws Exception {
        String expected = "ScavengerHunt is an engaging game played by children and adults alike. To play the game, divide the players into 2 teams, and give them the first clue. Once the players find the first item, they can locate the second with help from the next clue. When the time limit runs out, count the items collected from both teams";
        var scavengerHunt = new ScavengerHunt("SaiKrishna", 2);
        scavengerHunt.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of skill method, of class Bingo.
     *
     * @throws Exception
     */
    @Test
    public void testSkill() throws Exception {
        String expected = "ScavengerHunts allow us to practice problem-solving in a tangible way. It helps to reinforce and act-out methods they have been taught by parents or teachers in a physical way, leading to increased retention of the lessons";
        var scavengerHunt = new ScavengerHunt("SaiKrishna", 2);
        scavengerHunt.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Rules method, of class Bingo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRules() throws Exception {
        String expected = "You must find all items and snap a photo. Once the timer ends, whoever has the most pictures wins. If participating as a team, you must always stay together";
        var scavengerHunt = new ScavengerHunt("SaiKrishna", 2);
        scavengerHunt.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Scoring method, of class Bingo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testrScoring() throws Exception {
        String expected = "Players earn “points” for each task completed within a certain time frame. Scavenger hunt prizes are awarded to the team with the highest score";
        var scavengerHunt = new ScavengerHunt("SaiKrishna", 2);
        scavengerHunt.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
