package MFSProjects;

/**
 * Here we define the different car parts by name and price
 */

public class CarPart {
    String partName;
    double partPrice;

    /**
     * @param partName  partName for the car: unique
     * @param partPrice price for the specific part
     */
    public CarPart(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;

    }

}



