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
 * Test Badminton using JUnit5
 *
 * @author s545030
 */
public class BadmintonTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public BadmintonTest() {
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
     * Test of game method, of class Badminton.
     *
     * @throws Exception
     */
//    @Test
//    public void testgame() throws Exception {
//        String expected = "I Like to play Badminton.";
//        var badminton = new Badminton("Satheesh", 2);
//        badminton.game();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }
    /**
     * Test of players method, of class Badminton.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testplayers() throws Exception {
        String expected = "Playing Badminton with 2 players.";
        var badminton = new Badminton("Satheesh", 2);
        badminton.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class Badminton.
     *
     * @throws Exception
     */
    @Test
    public void testPlay() throws Exception {
        String expected = "Badminton is a racquet sport played using racquets to hit a shuttlecock across a net.";
        var badminton = new Badminton("Satheesh", 2);
        badminton.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of skill method, of class Badminton.
     *
     * @throws Exception
     */
    @Test
    public void testSkill() throws Exception {
        String expected = "Badminton offers a wide variety of basic strokes, and players require a high level of skill to perform all of them effectively. All strokes can be played either forehand or backhand.";
        var badminton = new Badminton("Satheesh", 2);
        badminton.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Rules method, of class Badminton.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRules() throws Exception {
        String expected = "The court is rectangular and divided into halves by a net. Courts are usually marked for both singles and doubles play, although badminton rules permit a court to be marked for singles only.";
        var badminton = new Badminton("Satheesh", 2);
        badminton.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Scoring method, of class Badminton.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testrScoring() throws Exception {
        String expected = "Each game is played to 21 points, with players scoring a point whenever they win a rally regardless of whether they served (this differs from the old system where players could only win a point on their serve and each game was played to 15 points). A match is the best of three games.";
        var badminton = new Badminton("Satheesh", 2);
        badminton.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
