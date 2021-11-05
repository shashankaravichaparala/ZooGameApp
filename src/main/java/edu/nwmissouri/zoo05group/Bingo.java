/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author S545243 Satheesh Eppalapelli
 */
public abstract class Bingo extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    Bingo(String game_name, int number_of_players) {
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
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {

    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {

    }
}
