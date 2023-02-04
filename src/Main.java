import java.util.ArrayList;
public class Main{
    public void generateCars(int number) {
        Random random = new Random();
        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Ford");
        brands.add("Chevrolet");
        brands.add("Toyota");
        brands.add("BMW");
        brands.add("Mercedes-Benz");

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");
        colors.add("Silver");

        ArrayList<String> segments = new ArrayList<String>();
        segments.add("Premium");
        segments.add("Standard");
        segments.add("Budget");

        ArrayList<String> issues = new ArrayList<String>();
        issues.add("Engine");
        System.out.println("Choose a marketing strategy:");
        System.out.println("1. Successful transaction");
        System.out.println("2. Local newspaper ad");
        System.out.println("3. Internet ad");
        int strategy = input.nextInt();
        switch (strategy) {
            case 1:
                Dealer carDealer;
                carDealer.setCustomers(carDealer.getCustomers() + 2);
                System.out.println("2 new customers added from successful transaction.");
                break;
            case 2:
                int newspaperCost = 50;
                if (carDealer.getCash() >= newspaperCost) {
                    carDealer.setCash(carDealer.getCash() - newspaperCost);
                    int newCustomers = random.nextInt(5) + 1;
                    carDealer.setCustomers(carDealer.getCustomers() + newCustomers);
                    System.out.println(newCustomers + " new customers added from local newspaper ad. Cost: " + newspaperCost);
                } else {
                    System.out.println("Not enough cash for local newspaper ad.");
                }
                break;
            case 3:
                int internetCost = 20;
                if (carDealer.getCash() >= internetCost) {
                    carDealer.setCash(carDealer.getCash() - internetCost);
                    carDealer.setCustomers(carDealer.getCustomers() + 1);
                    System.out.println("1 new customer added from internet ad. Cost: " + internetCost);
                } else {
                    System.out.println("Not enough cash for internet ad.");


                    internetCost);
                } else {
                System.out.println("Not enough cash for internet ad.");
            }
            break;
            default:
                System.out.println("Invalid option selected. Please choose a valid option.");
                break;
        }
        public static class Dealer {
            public Dealer(int i) {

            }

            public void generateCars(int i) {
            }

            public ArrayList<Car> getCars() {
            }

            public void repairCar(Car selectedCar, String selectedItem) {
            }
        }
    }

class Dealer {
    private int cash;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Dealer(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void buyCar(Car car) {
        if (cash >= car.getValue()) {
            cash -= car.getValue();
            cars.add(car);
            System.out.println("Car bought successfully.");
        } else {
            System.out.println("Not enough cash to buy this car.");
        }
    }

    public void sellCar(Car car) {
        if (cars.contains(car)) {
            cars.remove(car);
            cash += car.getValue();
            System.out.println("Car sold successfully.");
        } else {
            System.out.println("This car is not in your inventory.");
        }
    }
}