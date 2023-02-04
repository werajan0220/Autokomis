import java.util.Random;
class Adrian {
    public void repair(Car car, String item) {
        int cost = car.calculateRepairCost(item);
        Random random = new Random();
        int success = random.nextInt(10);
        int damage = random.nextInt(50);
        if (success < 2) {
            System.out

                    .println("Adrian failed to repair " + item + ". Call Janusz for help.");
        } else if (damage < 2) {
            System.out.println("Adrian caused additional damage while repairing " + item + ". Call Janusz for help.");
        } else {
            car.repair(item);
            car.setValue(car.getValue() + cost);
            System.out.println("Adrian has repaired " + item + " successfully. Cost: " + cost);
        }
    }
}