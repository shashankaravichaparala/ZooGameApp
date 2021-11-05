/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author S545243 Satheesh Eppalapelli
 */
public abstract class Badminton extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    Badminton(String game_name, int number_of_players) {
        super(game_name, number_of_players);
    }

    /**
     *
     * @param name
     * @return name
     *
     * call this play() method to see which game you are playing.
     */
    public String game(String name) {
        return name;
    }

    /**
     * call this player() method to see how many number of players are playing.
     */
    public void players() {
        System.out.printf("Playing Badminton with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("Badminton is a racquet sport played using racquets to hit a shuttlecock across a net.");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Badminton offers a wide variety of basic strokes, and players require a high level of skill to perform all of them effectively. All strokes can be played either forehand or backhand.");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("The court is rectangular and divided into halves by a net. Courts are usually marked for both singles and doubles play, although badminton rules permit a court to be marked for singles only");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("Each game is played to 21 points, with players scoring a point whenever they win a rally regardless of whether they served (this differs from the old system where players could only win a point on their serve and each game was played to 15 points). A match is the best of three games.");
    }

    public enum stockes {
        SERVES,
        CLEARS,
        SMASHES,
        DRIVES,
        DROPS;
    }
}
