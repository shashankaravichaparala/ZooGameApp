package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of ScavengerHunt
 *
 * @author S545040 Sai Krishna Vuppala
 */
public class ScavengerHuntGroup {

    private static ArrayList<ScavengerHunt> myGroup;

    /**
     * Create a static group of Bingo
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        ScavengerHunt a = new ScavengerHunt("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new ScavengerHunt("Bat", 2));
        myGroup.add(new ScavengerHunt("Ball", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("Hey - look at the ScavengerHunt Game!");
        myGroup.forEach(scavengerhunt -> {
        scavengerhunt.game();
        scavengerhunt.players();
        scavengerhunt.rules();
        scavengerhunt.play();
        scavengerhunt.skill();
        scavengerhunt.scoring();
        });
        System.out.println("Nice scavengerhunt - that was fun!");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

}
