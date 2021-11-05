package edu.nwmissouri.zoo05group;

/**
 *
 * @author Satheesh Eppalapelli
 */
public abstract class AbstractGame implements Runnable {

    private String game_name;
    private String number_of_players;

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getNumber_of_players() {
        return number_of_players;
    }

    public void setNumber_of_players(String number_of_players) {
        this.number_of_players = number_of_players;
    }

    /**
     *
     * @param name
     * @return
     */
    public abstract String game(String name);

    public abstract void gamePlay();

    public abstract void skill();

    public abstract void rules();

    public abstract void scoring();
}
