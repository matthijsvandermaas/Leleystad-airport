public class Plane extends Vehicle implements Flyable{
    public Plane(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void takeOff() {
        System.out.println("take off");
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
