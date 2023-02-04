import java.util.ArrayList;
import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        Car.Dealer dealer = new Car.Dealer(100000);
        dealer.generateCars(10);
        ArrayList<Car> inventory = dealer.getCars();
        for (Car car : inventory) {
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Value: " + car.getValue());
            System.out.println("Mileage: " + car.getMileage());
            System.out.println("Color: " + car.getColor());
            System.out.println("Segment: " + car.getSegment());
            System.out.println("Issues: " + car.getIssues());
            System.out.println();
        }
        for (Car car : inventory) {
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Value: " + car.getValue());
            System.out.println("Mileage: " + car.getMileage());
            System.out.println("Color: " + car.getColor());
            System.out.println("Segment: " + car.getSegment());
            System.out.println("Issues: " + car.getIssues());
            if (car.isCargo()) {
                System.out.println("Cargo space: " + car.getSize() + " cubic meters");
            } else
                System.out.println("This is not cargo car");
            System.out.println();
        }
    }

    Scanner scanner = new Scanner(System.in);
        while(true)

    {
        System.out.println("Select an option:");
        System.out.println("1. Show inventory");
        System.out.println("2. Buy car");
        System.out.println("3. Sell car");
        System.out.println("4. Repair car");
        System.out.println("5. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // wyświetlenie aktualnej bazy pojazdów
                break;
            case 2:
                // kupno pojazdu
                break;
            case 3:
                // sprzedaż pojazdu
                break;
            case 4:
                // naprawa pojazdu
                System.out.println("Select a car to repair:");
                // wyświetlenie dostępnych pojazdów
                int carIndex = scanner.nextInt();
                System.out.println("Select an item to repair:");
                // wyświetlenie dostępnych elementów pojazdu do naprawy
                int itemIndex = scanner.nextInt();
                JavaIOFileDescriptorAccess inventory = null;
                Car selectedCar = inventory.get(carIndex);
                String selectedItem;
                selectedItem = selectedCar.getIssues().get(itemIndex);
                int oldValue = selectedCar.getValue();
                Car.Dealer dealer;
                dealer = null;
                dealer.repairCar(selectedCar, selectedItem);
                System.out.println("Repaired " + selectedItem + " for car " + selectedCar.getBrand() + ".");
                System.out.println("Value before repair: " + oldValue + " Value after repair: " + selectedCar.getValue());
                break;
            case 5:
                // zakończenie programu
                return;
            default:
                // obsługa błędnego wyboru
                break;
        }
        Janusz janusz = new Janusz();
        Marian marian = new Marian();
        Adrian adrian = new Adrian();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Show inventory");
            System.out.println("2. Buy car");
            System.out.println("3. Sell car");
            System.out.println("4. Repair car");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // wyświetlenie aktualnej bazy pojazdów
                    break;
                case 2:
                    // kupno pojazdu
                    break;
                case 3:
                    // sprzedaż pojazdu
                    break;
                case 4:
                    // naprawa pojazdu
                    System.out.println("Select a car to repair:");
                    // wyświetlenie dostępnych pojazdów
                    int carIndex = scanner.nextInt();
                    System.out.println("Select an item to repair:");
                    // wyświetlenie dostępnych elementów pojazdu do naprawy
                    int itemIndex = scanner.nextInt();
                    System.out.println("Select a mechanic:");
                    System.out.println("1. Janusz");
                    System.out.println("2. Marian");
                    System.out.println("3. Adrian");
                    int mechanic = scanner.nextInt();
                    Car selectedCar = inventory.get(carIndex);
                    String selectedItem = selectedCar.getIssues().get(itemIndex);
                    int oldValue = selectedCar.getValue();
                    switch (mechanic) {
                        case 1:
                            janusz.repair(selectedCar, selectedItem);
                            break;
                        case 2:
                            marian.repair(selectedCar, selectedItem);
                            break;
                        case 3:
                            adrian.repair(selectedCar, selectedItem);
                            break;
                        default:
                            System.out.println("Invalid selection");
                            break;
                    }
                    System.out.println("Value before repair: " + oldValue + " Value after repair: " + selectedCar.getValue());
                    break;
                case 5:
                    // zakończenie programu
                    return;
                default:
                    // obsługa błędnego wyboru
                    break;
            }
        }
    }
}