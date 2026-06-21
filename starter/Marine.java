/**
 * Marine subclass. Implements Trackable and Relocatable.
 *
 * TODO M2: Make this class extend Animal
 * TODO M3: Make this class implement Trackable and Relocatable
 */
public class Marine /* TODO M2: extends Animal */ /* TODO M3: implements Trackable, Relocatable */ {
    // TODO M2: Declare private fields: maxDepthM (double), tankSizeLitres (int)

    /**
     * Constructor.
     * TODO M2: Implement constructor that calls super() and sets Marine-specific fields
     */
    public Marine(String species, String nickname, String island, double weightKg, String healthStatus,
                  double maxDepthM, int tankSizeLitres) {
        // TODO M2: Call super constructor
        // TODO M2: Set maxDepthM and tankSizeLitres
    }

    // TODO M2: Write getMaxDepthM() and getTankSizeLitres() getters

    /**
     * TODO M2: Implement getType() - returns "Marine"
     */

    /**
     * Daily food cost = 50.0 + weightKg * 3.0
     * TODO M2: Implement getDailyFoodCostTTD()
     */

    // --- Trackable methods ---
    // TODO M4: Implement logSighting(String date, String location)

    // TODO M4: Implement getSightingCount()

    // TODO M4: Implement getLastSighting()

    // --- Relocatable methods ---
    // TODO M6: Implement canRelocateTo(String targetIsland)
    //          Returns true only if targetIsland is NOT the animal's current island

    // TODO M6: Implement getRelocationCost()
    //          Returns 2000.0 + tankSizeLitres * 5.0

    // TODO M6: Implement relocateTo(String island)
    //          Updates the island using setIsland()
}
