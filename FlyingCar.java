public class FlyingCar extends Vehicle implements Flyable, Driveable{
    public FlyingCar(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("vroem!");
    }

    @Override
    public void brake() {
        System.out.println("skurrk!");

    }

    @Override
    public void changeGear() {
        System.out.println("kruk");

    }

    @Override
    public void takeOff() {
        System.out.println("go up");

    }

    @Override
    public void land() {
        System.out.println("land");

    }

    @Override
    public void changealtitude() {
        System.out.println("go up");

    }
}

