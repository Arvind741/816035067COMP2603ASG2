import java.util.ArrayList;

/**
 * Abstract base class for all animals in the conservation system.
 */
public abstract class Animal {
    // TODO M1: Declare static nextId field, starting at 1

    // TODO M1: Declare private fields:
    //   animalId (int), species (String), nickname (String),
    //   island (String), weightKg (double), healthStatus (String)

    // TODO M4: Declare private ArrayList<String> sightings field

    /**
     * Constructor: assigns auto-incremented ID, validates all parameters.
     * Species, nickname, island must not be null or empty.
     * weightKg must be > 0.
     * healthStatus must be "Healthy", "Injured", or "Critical".
     *
     * TODO M1: Implement constructor with validation
     * TODO M4: Initialize sightings list
     */
    public Animal(String species, String nickname, String island, double weightKg, String healthStatus) {
        // TODO M1: Validate parameters and assign fields
        // TODO M1: Auto-assign animalId from nextId, then increment nextId
        // TODO M4: Initialize sightings ArrayList
    }

    // TODO M1: Write getters for all fields (getAnimalId, getSpecies, getNickname,
    //          getIsland, getWeightKg, getHealthStatus)

    // TODO M2: Write setIsland(String island) method

    // TODO M4: Write getSightings() getter that returns the ArrayList<String>

    /**
     * Updates the health status after validation.
     * TODO M1: Implement updateHealth
     */
    public void updateHealth(String newStatus) {
        // TODO M1: Validate newStatus and update the field
    }

    /**
     * Returns the animal type: "Bird", "Reptile", or "Marine".
     * TODO M2: Declare as abstract
     */
    public abstract String getType();

    /**
     * Returns the daily food cost in TTD. Varies by subclass.
     * TODO M2: Declare as abstract
     */
    public abstract double getDailyFoodCostTTD();

    /**
     * Format: "#%03d %s '%s' (%s) [%s] %.2f kg - %s"
     * Example: "#001 Scarlet Ibis 'Ruby' (Trinidad) [Bird] 0.35 kg - Healthy"
     *
     * TODO M1: Implement toString
     */
    @Override
    public String toString() {
        // TODO M1: Return formatted string
        return "";
    }

    /**
     * Two animals are equal if they have the same animalId.
     *
     * TODO M5: Implement equals
     */
    @Override
    public boolean equals(Object obj) {
        // TODO M5: Implement equality by animalId
        return false;
    }

    /**
     * TODO M5: Implement hashCode based on animalId
     */
    @Override
    public int hashCode() {
        // TODO M5: Return hash based on animalId
        return 0;
    }
}
