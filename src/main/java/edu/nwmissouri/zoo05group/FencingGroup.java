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
public class FencingGroup {

    private static ArrayList<Fencing> myGroup;

    /**
     * Create a static group of Fencing
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Fencing a = new Fencing("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new Fencing("Soil", 2));
        myGroup.add(new Fencing("Himalayas", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("Hey - look at the Fencing Game!");
        myGroup.forEach(fencing -> {
            fencing.game("Fencing");
            fencing.players();
            fencing.rules();
            fencing.play();
            fencing.skill();
            fencing.scoring();
        });
        System.out.println("Nice Fencing - that was fun!");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

}
