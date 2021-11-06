/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 *
 * @author S545113
 */
public class RowingGroup {

    private static ArrayList<Rowing> myGroup;

    /**
     * Create a static group of Rowing
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Rowing a = new Rowing("vizag", 2);
        myGroup.add(a);
        myGroup.add(new Rowing("sea", 2));
        myGroup.add(new Rowing("tirupathi", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRR");
        System.out.println("Hey - look at the Rowing Game!");
        myGroup.forEach(Rowing -> {
            Rowing.game("Rowing");
            Rowing.players();
            Rowing.rules();
            Rowing.play();
            Rowing.skill();
            Rowing.scoring();
        });
        System.out.println("Nice Rowing - that was fun!");
        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRR");
    }

}
