/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.util.Scanner;

/**
 * ZooApp is a Game simulation created by Group05 Section 05.
 *
 * @author Rahul Konda, Keerthana, Gayatri, SaiKrishna, Sathish and shashank
 */
public class GameApp {

// Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our Group05 GameZone!";

// Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

// Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our GameZone!";

// specify number of animal types available
    private static final int NUMBER_GAME_TYPES = 20;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

// output welcome
        System.out.println(GREETING_MESSAGE);

// output how to escape
        System.out.println(ESCAPE_MESSAGE);

// construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

// Prompt for topic: ask if they want to see games
        System.out.println("Do you want to see GameZone (y/n)?");
        var animalInterestInput = scanner.next();

// if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

// declare an int for the game type number input
            int typeNumberInput;

// declare a boolean for isValid
            boolean isValid;

// do the list prompt for the first time, loop back while valid
            do {
// Prompt for type: ask if they want to see games
                System.out.println();
                System.out.println(" 1.SoftBall ");
                System.out.println(" 2.Badminton ");
                System.out.println(" 3.Bingo ");
                System.out.println(" 4.Carroms ");
                System.out.println(" 5.ScavengerHunt ");
                System.out.println(" 6.Monopoly ");
                System.out.println(" 7.Uno ");
                System.out.println(" 8.Golf ");
                System.out.println(" 9.Sequence ");
                System.out.println("10.DogAndBone ");
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

// set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_GAME_TYPES;

// switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {
                    case 1 -> {
                        SoftBallGroup.create();
                        SoftBallGroup.run();
                    }
                    case 2 -> {
                        BadmintonGroup.create();
                        BadmintonGroup.run();
                    }
                    case 3 -> {
                        BingoGroup.create();
                        BingoGroup.run();
                    }
                    case 4 -> {
                        CarromsGroup.create();
                        CarromsGroup.run();
                    }
                    case 5 -> {
                        ScavengerHuntGroup.create();
                        ScavengerHuntGroup.run();
                    }
                    case 6 -> {
                        MonopolyGroup.create();
                        MonopolyGroup.run();
                    }
                    case 7 -> {
                        UnoGroup.create();
                        UnoGroup.run();
                    }
                    case 8 -> {
                        GolfGroup.create();
                        GolfGroup.run();
                    }
                    case 9 -> {
                        SequenceGroup.create();
                        SequenceGroup.run();
                    }
                    case 10 -> {
                        DogAndBoneGroup.create();
                        DogAndBoneGroup.run();
                    }
                    default -> {
                    }
                }

// while the input is valid, we loop back
            } while (isValid);

// close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
// System.out.println("Do you want to go on an adventure (y/n)?");
// var adventureInterestInput = scanner.next();
// if (adventureInterestInput.toUpperCase().startsWith("Y")) {
// System.out.println("Sorry - this option is not yet available.");
// }
// output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

}
