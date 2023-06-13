public class Car extends Vehicle implements Driveable {
    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("go!");
    }

    @Override
    public void brake() {
        System.out.println("stop!");

    }

    @Override
    public void changeGear() {
        System.out.println("grrk");

    }
}

