package MFSProjects;


import java.util.Scanner;

/**
 * The program has to calculate the price for repair depending on the current repairs, having in mind the model of the car and the brand of parts.
 * We must accept 5 car models
 * Defines:
 * 1 - Define 5 model of cars [OK]
 * 2 - Define for each car model the additional service fee according the model of the car.[OK]
 * 3 - Define 5 service parts. [OK]
 * 4 - Define 5 types of repair service.[OK]
 * 5 - For each service define how many working days would take.[OK]
 * inputs:
 * 1 - car model [OK]
 * 2 - number of parts
 * 3 - parts needed for repair
 * 4 - number of services
 * 5 - types of service
 * <p>
 * Output:
 * 1 - Cost of the repair %.2f excluding VAT
 * 2 - Cost of the repair %.2f with VAT
 * 3 - Time fot the repair in working days.
 */
public class CarRepairShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //List list = Collection.synchronizedList(new ArrayList<>());

        System.out.println("Welcome to Gen-Auto-M!");
        System.out.println("Enter the car model: ");
        String model = input.next();
        System.out.println("Enter the car part: ");
        String part = input.next();
        System.out.println("Enter the type of service: ");
        String serviceType = input.next();

        Car car = new Car(model, part, serviceType);
        car.setServiceAudi();
        car.setServiceFord();
        car.setServiceToyota();
        car.setServiceNissan();
        car.setServiceVwGolf();
    }
}
