package ch12.car;

public class CarTest {
    void main() {
        Bus bus = new Bus("electric bus", "990", 1500,
                "commuter", 20);
        //car.model = "ray";
        bus.speed = 30;
        bus.gear = 0;
        bus.getBusInfo();
        bus.start();
        bus.stop();
    }
}