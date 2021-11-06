/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author Sai Krishna Vuppala
 */
public abstract class ScavengerHunt extends AbstractGame{
    /**
     *
     * @param game_name
     * @param number_of_players
     */
    ScavengerHunt(String game_name, int number_of_players) {
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
    
    public void players() {
        System.out.printf("Playing ScavangerHunt with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println(" Scavenger Hunt is an engaging game played by children and adults alike. To play the game, divide the players into 2 teams, and give them the first clue. Once the players find the first item, they can locate the second with help from the next clue. When the time limit runs out, count the items collected from both teams");
                
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println(" Scavenger hunts allow us to practice problem-solving in a tangible way. It helps to reinforce and act-out methods they have been taught by parents or teachers in a physical way, leading to increased retention of the lessons ");
    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println(" You must find all items and snap a photo. Once the timer ends, whoever has the most pictures wins. If participating as a team, you must always stay together ");
    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println(" Players earn “points” for each task completed within a certain time frame. Scavenger hunt prizes are awarded to the team with the highest score ");

    }

}
