import java.util.ArrayList;

/**
 * Manages a collection of animals at a single location.
 */
public class Sanctuary {
    // TODO M5: Declare private fields: name (String), island (String),
    //          capacity (int), animals (ArrayList<Animal>)

    /**
     * TODO M5: Implement constructor
     */
    public Sanctuary(String name, String island, int capacity) {
        // TODO M5: Initialize all fields, create empty ArrayList
    }

    // TODO M5: Write getters for name, island, capacity, and animals

    /**
     * Adds an animal to this sanctuary.
     * Rejects null animals, rejects if at capacity, rejects if animal's island
     * does not match this sanctuary's island.
     *
     * TODO M5: Implement addAnimal
     */
    public boolean addAnimal(Animal a) {
        // TODO M5: Validate and add
        return false;
    }

    /**
     * Removes and returns the animal with the given ID, or null if not found.
     *
     * TODO M5: Implement removeAnimal
     */
    public Animal removeAnimal(int animalId) {
        // TODO M5: Find by ID, remove, and return
        return null;
    }

    /**
     * TODO M5: Implement getAnimalCount
     */
    public int getAnimalCount() {
        // TODO M5
        return 0;
    }

    /**
     * Returns a new ArrayList containing only animals of the given type.
     *
     * TODO M7: Implement getAnimalsOfType
     */
    public ArrayList<Animal> getAnimalsOfType(String type) {
        // TODO M7: Filter by getType()
        return new ArrayList<Animal>();
    }

    /**
     * Returns the total daily food cost for all animals, rounded to 2 decimal places.
     *
     * TODO M7: Implement getDailyFoodBudget
     */
    public double getDailyFoodBudget() {
        // TODO M7: Sum getDailyFoodCostTTD() for all animals
        return 0.0;
    }

    /**
     * Returns all animals that implement the Relocatable interface.
     * Hint: use instanceof.
     *
     * TODO M8: Implement getRelocatableAnimals
     */
    public ArrayList<Animal> getRelocatableAnimals() {
        // TODO M8: Filter using instanceof Relocatable
        return new ArrayList<Animal>();
    }

    /**
     * Returns the animal with the highest daily food cost, or null if empty.
     *
     * TODO M7: Implement getMostExpensiveAnimal
     */
    public Animal getMostExpensiveAnimal() {
        // TODO M7: Find max by getDailyFoodCostTTD()
        return null;
    }

    /**
     * Transfers an animal to another sanctuary.
     * If the animal does not implement Relocatable, the transfer fails:
     * re-add the animal to this sanctuary and return false.
     * Otherwise, call relocateTo on the animal, then addAnimal on target.
     *
     * TODO M8: Implement transferAnimal
     */
    public boolean transferAnimal(int animalId, Sanctuary target) {
        // TODO M8: Remove animal, check Relocatable, relocate, add to target
        return false;
    }

    /**
     * Prints each animal's toString, indented by 2 spaces.
     *
     * TODO M5: Implement printRoster
     */
    public void printRoster() {
        // TODO M5: Loop and print
    }

    /**
     * Format: "Name (Island) [count/capacity animals]"
     * Example: "Caroni Bird Sanctuary (Trinidad) [12/50 animals]"
     *
     * TODO M5: Implement toString
     */
    @Override
    public String toString() {
        // TODO M5: Return formatted string
        return "";
    }
}
