public class Main {
    public static void main(String[] args) {
        Car car = new Car(0, 1200);
        Plane plane = new Plane(0, 16000);
        FlyingCar flyingCar = new FlyingCar(0, 1500);
        AirPort airPort = new AirPort();

        car.startEngine();
        car.accelerate();
        car.brake();
        car.killEngine();

        plane.startEngine();
        plane.takeOff();
        plane.changealtitude();
        plane.land();
        plane.killEngine();

        flyingCar.startEngine();
        flyingCar.takeOff();
        flyingCar.changealtitude();
        flyingCar.land();
        flyingCar.brake();
        flyingCar.killEngine();
    }

}
