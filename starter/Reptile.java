/**
 * Reptile subclass. Implements Trackable but NOT Relocatable.
 *
 * TODO M2: Make this class extend Animal
 * TODO M3: Make this class implement Trackable
 */
public class Reptile /* TODO M2: extends Animal */ /* TODO M3: implements Trackable */ {
    // TODO M2: Declare private fields: isVenomous (boolean), lengthCm (double)

    /**
     * Constructor.
     * TODO M2: Implement constructor that calls super() and sets Reptile-specific fields
     */
    public Reptile(String species, String nickname, String island, double weightKg, String healthStatus,
                   boolean isVenomous, double lengthCm) {
        // TODO M2: Call super constructor
        // TODO M2: Set isVenomous and lengthCm
    }

    // TODO M2: Write isVenomous() and getLengthCm() getters

    /**
     * TODO M2: Implement getType() - returns "Reptile"
     */

    /**
     * Daily food cost = 25.0 + weightKg * 2.0
     * TODO M2: Implement getDailyFoodCostTTD()
     */

    // --- Trackable methods ---
    // TODO M4: Implement logSighting(String date, String location)

    // TODO M4: Implement getSightingCount()

    // TODO M4: Implement getLastSighting()
}
