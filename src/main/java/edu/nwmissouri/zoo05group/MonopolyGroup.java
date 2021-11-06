package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Monopoly
 *
 * @author S545030
 */
public class MonopolyGroup {

    private static ArrayList<Monopoly> myGroup;

    /**
     * Create a static group of Monopoly
     *
     * @return 
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Monopoly a = new Monopoly("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new Monopoly("Soil", 2));
        myGroup.add(new Monopoly("Himalayas", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("Hey - look at the Monopoly Game!");
        myGroup.forEach(monopoly -> {
            monopoly.game("Monopoly");
            monopoly.players();
            monopoly.rules();
            monopoly.play();
            monopoly.skill();
            monopoly.scoring();
        });
        System.out.println("Nice Monopoly - that was fun!");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

}
