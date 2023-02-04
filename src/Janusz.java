class Janusz {
    public void repair(Car car, String item) {
        car.repair(item);
        System.out.println("Janusz has repaired " + item + " with 100% guarantee.");
    }
    public void repair(Car car, String item) {
        int cost = car.calculateRepairCost(item);
        car.repair(item);
        car.setValue(car.getValue() + cost);
        System.out.println("Janusz has repaired " + item + " with 100% guarantee. Cost: " + cost);
    }
}
