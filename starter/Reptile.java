/**
 * Reptile subclass. Implements Trackable but NOT Relocatable.
 *
 * TODO M2: Make this class extend Animal
 * TODO M3: Make this class implement Trackable
 */
public class Reptile extends Animal implements Trackable, Relocatable/* TODO M2: extends Animal */ /* TODO M3: implements Trackable */ {
    // TODO M2: Declare private fields: isVenomous (boolean), lengthCm (double)
    private boolean venomous;
    private double lengthCm;
    /**
     * Constructor.
     * TODO M2: Implement constructor that calls super() and sets Reptile-specific fields
     */
    public Reptile(String species, String nickname, String island, double weightKg, String healthStatus,
                   boolean isVenomous, double lengthCm) {
        // TODO M2: Call super constructor
        // TODO M2: Set isVenomous and lengthCm
        super(species, nickname, island, weightKg, healthStatus);

        if (lengthCm <= 0) {
            throw new IllegalArgumentException("Invalid length");
        }

        this.venomous = venomous;
        this.lengthCm = lengthCm;
    }

    // TODO M2: Write isVenomous() and getLengthCm() getters
    public boolean isVenomous() { return venomous; }
    public double getLengthCm() { return lengthCm;}

    /**
     * TODO M2: Implement getType() - returns "Reptile"
     */
    @Override
    public String getType() { return "Reptile";}

    /**
     * Daily food cost = 25.0 + weightKg * 2.0
     * TODO M2: Implement getDailyFoodCostTTD()
     */
    public double getDailyFoodCostTTD(){
        return 25.0 + getWeightKg() * 2.0;
    }

    // --- Trackable methods ---
    // TODO M4: Implement logSighting(String date, String location)

    // TODO M4: Implement getSightingCount()

    // TODO M4: Implement getLastSighting()
}
