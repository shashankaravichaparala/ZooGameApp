package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Bingo
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class BingoGroup {

    private static ArrayList<Bingo> myGroup;

    /**
     * Create a static group of Bingo
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Bingo a = new Bingo("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new Bingo("Soil", 2));
        myGroup.add(new Bingo("Himalayas", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("Hey - look at the Bingo Game!");
        myGroup.forEach(bingo -> {
        bingo.game("Bingo");
        bingo.players();
        bingo.rules();
        bingo.play();
        bingo.skill();
        bingo.scoring();
        });
        System.out.println("Nice Bingo - that was fun!");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

}
