package edu.nwmissouri.zoo05group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Denise Case
 */
@Controller
public class ZooIndexController {

    private static final String GREETING_MESSAGE_ZOO = "Welcome to our 542 Zoo App!";
    private static final String GREETING_MESSAGE_GAME = "Welcome to our 542 Zoo Game Zone!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_ANIMAL_TYPES = 60;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE_ZOO);
        model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    /**
     * Map GET request to "/games" to games() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/games")
    public String games(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE_GAME);
        model.addAttribute("gameMap", ZooBuildSwitch.getAllGameMap());
        model.addAttribute("customGameGroup", getCustomGameGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "games";
    }

    /**
     * Map GET request to "/persons" to persons() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/persons")
    public String persons() {
        return "persons";
    }

    private String getCustomAnimalGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);

        switch (intID) {
            case 1 -> {
                AardvarkGroup.create();
                AardvarkGroup.run();
            }
            case 2 -> {
                FloppyGroup.create();
                FloppyGroup.run();
            }
            case 3 -> {
                RabbitGroup.create();
                RabbitGroup.run();
            }
            case 4 -> {
                ShoebillGroup.create();
                ShoebillGroup.run();
            }
            case 5 -> {
                StagGroup.create();
                StagGroup.run();
            }
            case 6 -> {
                StringRayGroup.create();
                StringRayGroup.run();
            }
            case 7 -> {
                XraytetraGroup.create();
                XraytetraGroup.run();
            }
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }

    private String getCustomGameGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);

        switch (intID) {
            case 1 -> {
                BadmintonGroup.create();
                BadmintonGroup.run();
            }
            case 2 -> {
                BingoGroup.create();
                BingoGroup.run();
            }
            case 3 -> {
                CarromsGroup.create();
                CarromsGroup.run();
            }
            case 4 -> {
                DogAndBoneGroup.create();
                DogAndBoneGroup.run();
            }
            case 5 -> {
                GolfGroup.create();
                GolfGroup.run();
            }
            case 6 -> {
                MonopolyGroup.create();
                MonopolyGroup.run();
            }
            case 7 -> {
                ScavengerHuntGroup.create();
                ScavengerHuntGroup.run();
            }
            case 8 -> {
                SequenceGroup.create();
                SequenceGroup.run();
            }
            case 9 -> {
                SoftBallGroup.create();
                SoftBallGroup.run();
            }
            case 10 -> {
                StagGroup.create();
                StagGroup.run();
            }
            case 11 -> {
                UnoGroup.create();
                UnoGroup.run();
            }
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
}
