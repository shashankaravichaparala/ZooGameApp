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

    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";
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
        model.addAttribute("greeting", GREETING_MESSAGE);
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
    public String games() {
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
                DogAndBoneGroup.create();
                DogAndBoneGroup.run();
            }
            case 6 -> {
                FloppyGroup.create();
                FloppyGroup.run();
            }
            case 7 -> {
                GolfGroup.create();
                GolfGroup.run();
            }
            case 8 -> {
                MonopolyGroup.create();
                MonopolyGroup.run();
            }
            case 9 -> {
                RabbitGroup.create();
                RabbitGroup.run();
            }
            case 10 -> {
                ScavengerHuntGroup.create();
                ScavengerHuntGroup.run();
            }
            case 11 -> {
                SequenceGroup.create();
                SequenceGroup.run();
            }
            case 12 -> {
                ShoebillGroup.create();
                ShoebillGroup.run();
            }
            case 13 -> {
                SoftBallGroup.create();
                SoftBallGroup.run();
            }
            case 14 -> {
                StagGroup.create();
                StagGroup.run();
            }
            case 15 -> {
                StringRayGroup.create();
                StringRayGroup.run();
            }
            case 16 -> {
                UnoGroup.create();
                UnoGroup.run();
            }
            case 17 -> {
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
}
