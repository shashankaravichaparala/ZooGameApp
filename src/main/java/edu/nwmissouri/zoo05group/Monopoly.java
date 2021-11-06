/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *
 * @author S545030
 */
public class Monopoly extends AbstractGame implements Runnable{
    public Monopoly(String game_name, int number_of_players){
        super();
        
    }

    Monopoly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    @Override
    public void gamePlay() {
        System.out.println(" A game played with the two to six members");
    }

    @Override
    public void skill() {
        System.out.println("Active mind and some business skills ");
    }

   @Override
    public void rules() {
        System.out.println(" 1. Each player chooses one token to represent them while traveling around the board \n 2.Each player is given $1500 \n 3. Select someone as banker. If this person also plays, then he must keep his personal funds \n 4. Then each player places his token on the corner marked GO and throw the dice and move his the number of spaces indicated by the dice." );
    }
    
    @Override
    public void scoring() {
        System.out.println("Person with highest amount wins");
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
