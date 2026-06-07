package ch12.car;

public class CarTest {
    void main() {
        Bus bus = new Bus("electric bus", "990", 1500,
                "commuter", 20);
        //car.model = "ray";
        //bus.speed = 30;
        //bus.gear = 0;
        bus.getBusInfo();
        //bus.start();
        //bus.stop();
        for(int i = 0; i < 21; i++){
            int temp = (int)(Math.random()*93 + 2);
            System.out.println("passenger age : " + temp);
            bus.ride(temp);
            bus.getBusInfo();
        }
        bus.leave(3);
        bus.getBusInfo();
        bus.leave(20);
        bus.getBusInfo();
        bus.ride((int)(Math.random()*93 + 2));
        bus.getBusInfo();
    }
}