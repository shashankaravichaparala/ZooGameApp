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
 * Test Sequence using JUnit5
 *
 * @author s545031
 */
public class SequenceTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public SequenceTest() {
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
        String expected = "Playing Sequence with 4";
        var sequence = new Sequence("Keerthana", 4);
        sequence.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * 
     * @throws Exception 
     */

    @Test
    public void testPlay() throws Exception {
        String expected = "The object of the game is to form rows of five poker chips on the board by placing the chips on the board spaces corresponding to cards played from the player's hand";
        var sequence = new Sequence("Keerthana", 4);
        sequence.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testSkill() throws Exception {
        String expected = "The beginning, middle, and also to the ability to retell the events within a given text in the order in which they occurred. The ability to sequence events in a text is a key comprehension strategy, especially for narrative texts";
        var sequence = new Sequence("Keerthana", 4);
        sequence.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testRules() throws Exception {
        String expected = "Teams should split up evenly and each player or team takes a color of marker. Players should sit so that no two teammates sit next to one another. A random dealer is chosen and shuffles the deck, and a number of cards are dealt out determined by the number of players. In a 2-player game each player receives a hand of 7 cards, 3 and 4 players receive 6 cards each, 6 players receive 5 cards each, 8 and 9 players receive 4 cards each, and 10 and 12 players receive 3 cards each. The remaining cards form the draw deck. The board should be placed centrally as well as the draw deck, additional markers, and discards";
        var sequence = new Sequence("Keerthana", 4);
        sequence.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testrScoring() throws Exception {
        String expected = "To win you must complete two sequence strands. A sequence is achieved when you have a row of five chips of the same color. This can occur in any direction, vertically, horizontally, or diagonally. You may use any one of the spaces from one sequence in the second sequence";
        var sequence = new Sequence("Keerthana", 4);
        sequence.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}


