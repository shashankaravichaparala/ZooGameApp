/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author S545040
 */
public class SoftBallTest {
    
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public SoftBallTest() {
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

   
    @org.junit.jupiter.api.Test
    public void testplayers() throws Exception {
        String expected = "Playing SoftBall with 2";
        var softBall = new SoftBall("SaiKrishna", 2);
        softBall.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class Bingo.
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.Test
    public void testPlay() throws Exception {
        String expected = "Softball is a bat-and-ball sport played between two teams of 10 players. The object of the game is to score more runs than the other team";
        var softBall = new SoftBall("SaiKrishna", 2);
        softBall.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of skill method, of class Bingo.
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.Test
    public void testSkill() throws Exception {
        String expected = "The skills required for softball are : throwingcatching, hitting for contact, hitting for power, and running";
        var softBall = new SoftBall("SaiKrishna", 2);
        softBall.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Rules method, of class Bingo.
     *
     * @throws java.lang.Exception
     */
    @org.junit.jupiter.api.Test
    public void testRules() throws Exception {
        String expected = "TEach team bats once in each innings. A batter must successfully strike the ball and run around, Once they get all the way around and back to home plate without being given out a run is Scored. The fielding team can prevent the batsmen by making them miss the ball, catching the ball, tagging one of the bases before they reach. A home run can be scored by hitting the ball over the outfield and into a dead ball area";
        var softBall = new SoftBall("SaiKrishna", 2);
        softBall.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Scoring method, of class Bingo.
     *
     * @throws java.lang.Exception
     */
    @org.junit.jupiter.api.Test
    public void testrScoring() throws Exception {
        String expected = "To score a run the batsman must successfully first hit the ball and make it around the bases without being given out. One run is scored for every batsmen they manage to get round. A run can be scored even if the batsmen who hit the ball doesn’t make it round to home plate but manages to get a player that’s already on one of the bases home";
        var softBall = new SoftBall("SaiKrishna", 2);
        softBall.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    
}
