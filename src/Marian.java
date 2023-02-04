import java.util.Random;
class Marian {
    public void repair(Car car, String item) {
        Random random = new Random();
        int success = random.nextInt(10);
        if (success == 0) {
            System.out.println("Marian failed to repair " + item + ". Call Janusz for help.");
        } else {
            car.repair(item);
            System.out.println("Marian has repaired " + item + " successfully.");
        }
    }
}