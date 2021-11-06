/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author S545040 Sai Krishna Vuppala
 */
public class ScavengerHunt extends AbstractGame {


    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Bingo(String game_name, int number_of_players) {
        super(game_name, number_of_players);
    }

    /**
     *
     * @param game_name
     * call this play() method to see which game you are playing.
     */
    @Override
    public void game(String game_name) {
        System.out.printf("Playing %s\n", this.game_name);
    }

    /**
     * call this player() method to see how many number of players are playing.
     */
    public void players() {
        System.out.printf("Playing ScavengerHunt with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("ScavengerHunt is an engaging game played by children and adults alike. To play the game, divide the players into 2 teams, and give them the first clue. Once the players find the first item, they can locate the second with help from the next clue. When the time limit runs out, count the items collected from both teams");

    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println(" ScavengerHunts allow us to practice problem-solving in a tangible way. It helps to reinforce and act-out methods they have been taught by parents or teachers in a physical way, leading to increased retention of the lessons ");
    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println(" You must find all items and snap a photo. Once the timer ends, whoever has the most pictures wins. If participating as a team, you must always stay together");
    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("Players earn “points” for each task completed within a certain time frame. Scavenger hunt prizes are awarded to the team with the highest score ");
    }

     void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        ScavengerHunts sh = new ScavengerHunt("ScavengerHunt", 2);
        sh.game("ScavengerHunt");
        sh.players();
        sh.rules();
        sh.play();
        sh.skill();
        sh.scoring();

    }

    /**
     * An instance of Runnable - call this run() method to
     * see all the ScavengerHunt tricks.
     */
    @Override
    public void run() {
        this.game();
        this.players();
        this.rules();
        this.play();
        this.skill();
        this.scoring();
    }
}
