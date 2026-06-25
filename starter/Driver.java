import java.util.ArrayList;

/**
 * Console-based demonstration of the Caribbean Wildlife Conservation Tracker.
 * Creates sanctuaries, adds animals, and exercises all major features.
 *
 * TODO M9: Implement the entire Driver class
 *
 * See the README for the complete expected output.
 */
public class Driver {
    public static void main(String[] args) {
        // TODO M9: Create two sanctuaries:
        //   "Caroni Bird Sanctuary", Trinidad, capacity 20
        Sanctuary caroni= new Sanctuary("Caroni Bird Sanctuary", "Trinidad", 20);

        //   "Blue Lagoon Marine Park", Jamaica, capacity 15
        Sanctuary blueLagoon= new Sanctuary("Blue Lagoon Marine Park", "Jamaica", 15);

        // TODO M9: Create and add animals to Caroni:
        //   Bird: "Scarlet Ibis", "Ruby", Trinidad, 0.35, "Healthy", 60.0, true
        Bird ruby= new Bird("Scarlet Ibis", "Ruby", "Trinidad", 0.35, "Healthy", 60.0, true);

        //   Bird: "Scarlet Ibis", "Blaze", Trinidad, 0.40, "Healthy", 58.0, true
        Bird blaze= new Bird("Scarlet Ibis", "Blaze", "Trinidad", 0.40, "Healthy", 58.0, true);

        //   Bird: "Cocrico", "Dusty", Trinidad, 0.25, "Injured", 30.0, true
        Bird dusty= new Bird("Cocrico", "Dusty", "Trinidad", 0.25, "Injured", 30.0, true);

        //   Reptile: "Spectacled Caiman", "Brutus", Trinidad, 45.0, "Healthy", false, 180.0
        Reptile brutus= new Reptile("Spectacled Caiman", "Brutus", "Trinidad", 45.0, "Healthy",false, 180.0);

        //   Reptile: "Green Anaconda", "Medusa", Trinidad, 30.0, "Critical", false, 350.0
        Reptile medusa= new Reptile("Green Anaconda", "Medusa", "Trinidad", 30.0, "Critical",false, 350.0);

        //   Marine: "Leatherback Turtle", "Atlas", Trinidad, 500.0, "Healthy", 1200.0, 8000
        Marine atlas= new Marine("Leatherback Turtle", "Atlas", "Trinidad", 500.0, "Healthy", 1200.0, 8000);

        // TODO M9: Create and add animals to Blue Lagoon:
        //   Bird: "Doctor Bird", "Flash", Jamaica, 0.01, "Healthy", 12.0, true
        Bird flash= new Bird("Doctor Bird", "Flash", "Jamaica", 0.01, "Healthy", 12.0, true);

        //   Marine: "Hawksbill Turtle", "Shelly", Jamaica, 80.0, "Injured", 50.0, 3000
        Marine shelly= new Marine("Hawksbill Turtle", "Shelly", "Jamaica", 80.0, "Injured", 50.0, 3000);

        //   Marine: "Nurse Shark", "Gills", Jamaica, 110.0, "Healthy", 75.0, 5000
        Marine gills= new Marine("Nurse Shark", "Gills", "Jamaica", 110.0, "Healthy", 75.0, 5000);


        // TODO M9: Print "=== Caroni Bird Sanctuary roster ===" then printRoster()
        System.out.println("=== Caroni Bird Sanctuary roster ===");
        caroni.printRoster();

        // TODO M9: Print "=== Blue Lagoon Marine Park roster ===" then printRoster()
        System.out.println("\n=== Blue Lagoon Marine Park roster ===");
        blueLagoon.printRoster();

        // TODO M9: Print "=== Daily food budgets ===" then each sanctuary's budget
        System.out.println("\n=== Daily food budgets ===");
        System.out.println(caroni.getName() + ": $" + caroni.getDailyFoodBudget());
        System.out.println(blueLagoon.getName() + ": $" + blueLagoon.getDailyFoodBudget());

        // TODO M9: Print "=== Birds at Caroni ===" then getAnimalsOfType("Bird")
        System.out.println("\n=== Birds at Caroni ===");

        for (Animal a : caroni.getAnimalsOfType("Bird")) {
            System.out.println("  " + a);
        }

        // TODO M9: Print "=== Relocatable animals at Caroni ===" then getRelocatableAnimals()
        System.out.println("\n=== Relocatable animals at Caroni ===");

        for (Animal a : caroni.getRelocatableAnimals()) {
            System.out.println("  " + a);
        }

        // TODO M9: Print "=== Sighting logs ===" then:
        System.out.println("\n=== Sighting logs ===");

        //   Log Ruby: ("2026-06-10", "Caroni Swamp"), ("2026-06-12", "Nariva Swamp")
        ruby.logSighting("2026-06-10", "Caroni Swamp");
        ruby.logSighting("2026-06-12", "Nariva Swamp");

        //   Log Atlas: ("2026-06-11", "Matura Beach")
        atlas.logSighting("2026-06-11", "Matura Beach");

        //   Print counts and last sightings for Ruby, Atlas, and Brutus
        System.out.println("Ruby: "+ ruby.getSightingCount() + " Last Sighting at: " + ruby.getLastSighting());

        System.out.println("Atlas: "+ atlas.getSightingCount() + " Last Sighting at: " + atlas.getLastSighting());

        System.out.println("Brutus: "+ brutus.getSightingCount() + " Last Sighting at: " + brutus.getLastSighting());

        // TODO M9: Print "=== Transfer Atlas to Blue Lagoon ===" then transfer and print result
        System.out.println("\n=== Transfer Atlas to Blue Lagoon ===");

        boolean moved = caroni.transferAnimal(atlas.getAnimalId(), blueLagoon);

        System.out.println(moved);

        blueLagoon.printRoster();

        // TODO M9: Print "=== Attempt to transfer Brutus (Reptile) ===" then transfer and print result
        System.out.println("\n=== Attempt to transfer Brutus (Reptile) ===");

        boolean moved2 = caroni.transferAnimal(brutus.getAnimalId(), blueLagoon);

        System.out.println(moved2);

        // TODO M9: Print "=== Most expensive animal at each sanctuary ==="
        System.out.println("\n=== Most expensive animal at each sanctuary ===");

        System.out.println(caroni.getMostExpensiveAnimal());

        System.out.println(blueLagoon.getMostExpensiveAnimal());

        // TODO M9: Print "=== Updated food budgets ==="
        System.out.println("\n=== Updated food budgets ===");

        System.out.println(caroni.getName() + ": $" + caroni.getDailyFoodBudget());

        System.out.println( blueLagoon.getName() + ": $" + blueLagoon.getDailyFoodBudget());
    }
}
