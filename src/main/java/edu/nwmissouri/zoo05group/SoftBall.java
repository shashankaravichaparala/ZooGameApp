/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author Sai Krishna Vuppala
 */
public abstract class SoftBall extends AbstractGame {
    /**
     *
     * @param game_name
     * @param number_of_players
     */
    SoftBall(String game_name, int number_of_players) {
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
        System.out.printf("Playing SoftBall with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println(" Softball is a bat-and-ball sport played between two teams of 10 players. The object of the game is to score more runs (points) than the other team ");
                
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println(" The skills required for softball are: throwing, catching, hitting for contact, hitting for power, and running ");
    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println(" Each team bats once in each innings. A batter must successfully strike the ball and run around, Once they get all the way around and back to home plate without being given out a run is Scored. The fielding team can prevent the batsmen by making them miss the ball, catching the ball, tagging one of the bases before they reach. A home run can be scored by hitting the ball over the outfield and into a dead ball area ");
    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println(" To score a run the batsman must successfully first hit the ball and make it around the bases without being given out. One run is scored for every batsmen they manage to get round. A run can be scored even if the batsmen who hit the ball doesn’t make it round to home plate but manages to get a player that’s already on one of the bases home ");

    }
}
