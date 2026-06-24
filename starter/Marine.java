/**
 * Marine subclass. Implements Trackable and Relocatable.
 *
 * TODO M2: Make this class extend Animal
 * TODO M3: Make this class implement Trackable and Relocatable
 */
public class Marine extends Animal/* TODO M2: extends Animal */ /* TODO M3: implements Trackable, Relocatable */ {
    // TODO M2: Declare private fields: maxDepthM (double), tankSizeLitres (int)
    private double maxDepthM;
    private int tankSizeLitres;

    /**
     * Constructor.
     * TODO M2: Implement constructor that calls super() and sets Marine-specific fields
     */
    public Marine(String species, String nickname, String island, double weightKg, String healthStatus,
                  double maxDepthM, int tankSizeLitres) {
        // TODO M2: Call super constructor
        // TODO M2: Set maxDepthM and tankSizeLitres
        super(species, nickname, island, weightKg, healthStatus);

        if (maxDepthM <= 0) {
            throw new IllegalArgumentException("Invalid depth");
        }

        if (tankSizeLitres <= 0) {
            throw new IllegalArgumentException("Invalid tank size");
        }
        this.maxDepthM = maxDepthM;
        this.tankSizeLitres = tankSizeLitres;

    }

    // TODO M2: Write getMaxDepthM() and getTankSizeLitres() getters
    public double getMaxDepthM() { return maxDepthM;}

    public int getTankSizeLitres() { return tankSizeLitres;}
    /**
     * TODO M2: Implement getType() - returns "Marine"
     */
    @Override
    public String getType() { return "Marine";}

    /**
     * Daily food cost = 50.0 + weightKg * 3.0
     * TODO M2: Implement getDailyFoodCostTTD()
     */
    @Override
    public double getDailyFoodCostTTD() {
        return 50.0 + getWeightKg() * 3.0;
    }

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
