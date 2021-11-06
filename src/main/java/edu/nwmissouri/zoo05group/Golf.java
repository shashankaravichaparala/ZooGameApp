/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author S545030
 */
public class Golf extends AbstractGame implements Runnable {

    public Golf(String game_name, int number_of_players) {
        //super(game_name,number_of_players);
    }

    @Override

    public void gamePlay() {
        System.out.println(" A game played in outdoors like in lawn areas");
    }

    @Override
    public void skill() {
        System.out.println("Strike, power ");
    }

    @Override
    public void rules() {
        System.out.println("The ball must be hit using standard clubs from the start of each hole to the green and ultimately into the hole, which is marked by a flag.");
    }

    @Override
    public void scoring() {
        System.out.println(" winner is the player with the lowest total");
    }

    @Override
    public String game(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
