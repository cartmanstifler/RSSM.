package MFSProjects;

/**
 * In this class we define the model of the car.
 * I have to store multiple car models.
 * Да представя моделите като в таблца и всеки модел да отговаря на число.
 * Като се въведе това число, да се избира и съответния модел.(Клоня към ползването на лист(още не знам как)).
 */

public class Car {
    String model;
    String part;
    double price;
    String service;
    double timeForRepair;
    double labour;
    double totalCost;
    double priceVat;

    public Car(String modelInput, String partInput, String serviceType) {
        this.model = modelInput; // Here we say that the model from the Class Car is equal to the model in the argument
        this.part = partInput;
        this.service = serviceType;
    }


    public void setServiceAudi() {
        if (model.equals("Audi") && part.equals("discBrake") && service.equals("change")) {
            price = 120.45;
            priceVat = (price * 0.2) + price;
            timeForRepair = 90;
            labour = 40;
            totalCost = labour + price;
            System.out.printf("The price for Audi`s discBrake is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change them.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Audi") && part.equals("radiator") && service.equals("change")) {
            price = 220.60;
            priceVat = (price * 0.2) + price;
            timeForRepair = 180;
            labour = 180;
            totalCost = price + labour;
            System.out.printf("The price for Audi`s radiator is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Audi") && part.equals("oilFilter") && service.equals("change")) {
            price = 45.20;
            priceVat = (price * 0.2) + price;
            timeForRepair = 25;
            labour = 30;
            totalCost = price + labour;
            System.out.printf("The price for Audi`s oilFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.\n", labour + priceVat);
        } else if (model.equals("Audi") && part.equals("fuelFilter") && service.equals("change")) {
            price = 30.78;
            priceVat = (price * 0.2) + price;
            timeForRepair = 20;
            labour = 20;
            totalCost = price + labour;
            System.out.printf("The price for Audi`s fuelFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.\n", labour + priceVat);
        } else if (model.equals("Audi") && part.equals("airFilter") && service.equals("change")) {
            price = 25.15;
            priceVat = (price * 0.2) + price;
            timeForRepair = 10;
            labour = 20;
            totalCost = price + labour;
            System.out.printf("The price for Audi`s fuelFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        }
    }

    public void setServiceFord() {
        if (model.equals("Ford") && part.equals("discBrake") && service.equals("change")) {
            price = 180.90;
            priceVat = (price * 0.2) + price;
            timeForRepair = 120;
            labour = 70;
            totalCost = labour + price;
            System.out.printf("The price for Ford`s discBrake is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change them.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Ford") && part.equals("radiator") && service.equals("change")) {
            price = 350.45;
            priceVat = (price * 0.2) + price;
            timeForRepair = 240;
            labour = 250;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s radiator is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Ford") && part.equals("oilFilter") && service.equals("change")) {
            price = 69.50;
            priceVat = (price * 0.2) + price;
            timeForRepair = 25;
            labour = 30;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s oilFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Ford") && part.equals("fuelFilter") && service.equals("change")) {
            price = 30.34;
            priceVat = (price * 0.2) + price;
            timeForRepair = 20;
            labour = 20;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s fuelFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Ford") && part.equals("airFilter") && service.equals("change")) {
            price = 25.19;
            priceVat = (price * 0.2) + price;
            timeForRepair = 10;
            labour = 20;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s airFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        }
    }

    public void setServiceToyota() {
        if (model.equals("Toyota") && part.equals("discBrake") && service.equals("change")) {
            price = 65.50;
            priceVat = (price * 0.2) + price;
            timeForRepair = 30;
            labour = 45.50;
            totalCost = labour + price;
            System.out.printf("The price for Toyota`s discBrake is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change them.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Toyota") && part.equals("radiator") && service.equals("change")) {
            price = 145.25;
            priceVat = (price * 0.2) + price;
            timeForRepair = 80;
            labour = 140.50;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s radiator is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Toyota") && part.equals("oilFilter") && service.equals("change")) {
            price = 35.25;
            priceVat = (price * 0.2) + price;
            timeForRepair = 15;
            labour = 25;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s oilFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Toyota") && part.equals("fuelFilter") && service.equals("change")) {
            price = 40.25;
            priceVat = (price * 0.2) + price;
            timeForRepair = 35;
            labour = 35;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s fuelFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Toyota") && part.equals("airFilter") && service.equals("change")) {
            price = 15.20;
            priceVat = (price * 0.2) + price;
            timeForRepair = 10;
            labour = 20;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s airFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        }
    }

    public void setServiceNissan() {
        if (model.equals("Nissan") && part.equals("discBrake") && service.equals("change")) {
            price = 130.50;
            priceVat = (price * 0.2) + price;
            timeForRepair = 70;
            labour = 65.80;
            totalCost = labour + price;
            System.out.printf("The price for Nissan`s discBrake is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change them.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Nissan") && part.equals("radiator") && service.equals("change")) {
            price = 166.25;
            priceVat = (price * 0.2) + price;
            timeForRepair = 135;
            labour = 120.50;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s radiator is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Nissan") && part.equals("oilFilter") && service.equals("change")) {
            price = 54.56;
            priceVat = (price * 0.2) + price;
            timeForRepair = 45;
            labour = 38;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s oilFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Nissan") && part.equals("fuelFilter") && service.equals("change")) {
            price = 25.34;
            priceVat = (price * 0.2) + price;
            timeForRepair = 15;
            labour = 44;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s fuelFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("Nissan") && part.equals("airFilter") && service.equals("change")) {
            price = 25.32;
            priceVat = (price * 0.2) + price;
            timeForRepair = 15;
            labour = 25;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s airFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        }
    }

    public void setServiceVwGolf() {
        if (model.equals("VwGolf") && part.equals("discBrake") && service.equals("change")) {
            price = 45.80;
            priceVat = (price * 0.2) + price;
            timeForRepair = 40;
            labour = 30.80;
            totalCost = labour + price;
            System.out.printf("The price for VwGolf`s discBrake is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change them.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("VwGolf") && part.equals("radiator") && service.equals("change")) {
            price = 120.85;
            priceVat = (price * 0.2) + price;
            timeForRepair = 45;
            labour = 60.25;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s radiator is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("VwGolf") && part.equals("oilFilter") && service.equals("change")) {
            price = 30.18;
            priceVat = (price * 0.2) + price;
            timeForRepair = 20;
            labour = 30;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s oilFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("VwGolf") && part.equals("fuelFilter") && service.equals("change")) {
            price = 18.29;
            priceVat = (price * 0.2) + price;
            timeForRepair = 15;
            labour = 25;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s fuelFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        } else if (model.equals("VwGolf") && part.equals("airFilter") && service.equals("change")) {
            price = 15.20;
            priceVat = (price * 0.2) + price;
            timeForRepair = 5;
            labour = 15;
            totalCost = price + labour;
            System.out.printf("The price for Ford`s airFilter is %.2f. BGN.\n", price);
            System.out.printf("It will take %.2f minutes to change it.\n", timeForRepair);
            System.out.printf("The total cost excluding VAT is %.2f. BGN.\n", totalCost);
            System.out.printf("The total cost including VAT is %.2f. BGN.", labour + priceVat);
        }
    }
}


