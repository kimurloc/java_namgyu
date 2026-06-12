package ch11.mycar.ex01;

public class CarTest {
    void main() {
        Car car = new Car();
        car.model = "ray";
        car.speed = 30;
        car.gear = 0;

        car.start();
        car.stop();
    }
}