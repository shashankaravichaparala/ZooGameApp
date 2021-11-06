package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Badminton
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class BadmintonGroup {

    private static ArrayList<Badminton> myGroup;

    /**
     * Create a static group of Badminton
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Badminton a = new Badminton("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new Badminton("Soil", 2));
        myGroup.add(new Badminton("Himalayas", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("Hey - look at the Badminton Game!");
        myGroup.forEach(badminton -> {
            badminton.game("Badminton");
            badminton.players();
            badminton.rules();
            badminton.play();
            badminton.skill();
            badminton.scoring();
        });
        System.out.println("Nice Badminton - that was fun!");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

}
