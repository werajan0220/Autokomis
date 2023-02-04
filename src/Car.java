import java.util.ArrayList;

class Car {
    private int value;
    private String brand;
    private int mileage;
    private String color;
    private String segment;
    private ArrayList<String> issues = new ArrayList<String>();

    public Car(int value, String brand, int mileage, String color, String segment, ArrayList<String> issues) {
        this.value = value;
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.issues = issues;
    }
    private int size;
    private boolean isCargo;

    public Car(int value, String brand, int mileage, String color, String segment, ArrayList<String> issues, int size, boolean isCargo) {
        // ... pozostałe inicjalizacje ...
        this.size = size;
        this.isCargo = isCargo;
    }
    public int calculateRepairCost(String item) {
        int cost = 0;
        switch (this.brand) {
            case "Brand1":
                switch (item) {
                    case "brakes":
                        cost = 100;
                        break;
                    case "suspension":
                        cost = 200;
                        break;
                    case "engine":
                        cost = 1000;
                        break;
                    case "body":
                        cost = 500;
                        break;
                    case "transmission":
                        cost = 500;
                        break;
                }
                break;
            case "Brand2":
                switch (item) {
                    case "brakes":
                        cost = 150;
                        break;
                    case "suspension":
                        cost = 250;
                        break;
                    case "engine":
                        cost = 1500;
                        break;
                    case "body":
                        cost = 750;
                        break;
                    case "transmission":
                        cost = 750;
                        break;
                }
                break;
            // pozostałe marki samochodów
        }
        return cost;
    }
}

    public int getSize() {
        return size;
    }

    public boolean isCargo() {
        return isCargo;
    }


    public int getValue() {
        return value;
    }

    public String getBrand() {
    }

    public String getMileage() {
    }

    public String getColor() {
    }

    public String getSegment() {
    }

    public String getIssues() {
    }

    public boolean isCargo() {
    }

    public String getSize() {
    }

    public void repair(String item) {
    }

    public void setValue(int i) {
    }

public class Dealer {
}

public class Dealer {
    public void generateCars(int i) {
    }
}