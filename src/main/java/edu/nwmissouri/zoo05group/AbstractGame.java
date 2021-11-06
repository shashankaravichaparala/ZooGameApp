package edu.nwmissouri.zoo05group;

/**
 *
 * @author S545243 Satheesh Eppalapelli
 */
public abstract class AbstractGame implements Runnable {

    /**
     * Every game has a name. Class variable name is not private, but protected
     * - only subclasses can use it.
     */
    protected String game_name = "no name";
     /**
     * Every game has a players. Class variable number_ofPlayers is not private, but protected
     * - only subclasses can use it.
     */
    protected int number_of_players = 0;

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    protected AbstractGame(String game_name, int number_of_players) {
        this.game_name = game_name;
        this.number_of_players = number_of_players;
    }

    /**
     *
     * @param name
     * 
     */
    public void game(String game_name) {
        System.out.printf("I Like to play %s. \n", this.game_name);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    public void play() {
        System.out.println("Which game do you want to play!");
    }

    /**
     *
     * call this skill() method to see all the skill for the game
     */
    public void skill() {
        System.out.println("What are the skill do you have for the gameplay!");
    }

    /**
     *
     * call this rules() method to see all the rules for the game
     */
    public void rules() {
        System.out.println("What are the rules for the gameplay!");
    }

    /**
     *
     * call this scoring() method to see all the scoring for the game
     */
    public void scoring() {
        System.out.println("Scoring for the gameplay!");
    }
}
