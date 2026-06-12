package ch12.car;

public class CarTest {
    void main() {
        Bus bus1 = new Bus("electric bus", "990",
                "commuter", 20);
        Bus bus2 = new Bus("lpg bus", "399",
                "commuter", 25);
        //car.model = "ray";
        //bus.speed = 30;
        //bus.gear = 0;
        //bus.getBusInfo();
        //bus.start();
        //bus.stop();
        for(int i = 0; i < 21; i++){
            int temp = (int)(Math.random()*93 + 2);
            System.out.println("passenger age : " + temp);
            bus1.ride(temp);
            bus1.getBusInfo();
        }
        bus1.leave(3);
        bus1.getBusInfo();
        bus1.leave(20);
        bus1.getBusInfo();
        bus2.ride((int)(Math.random()*93 + 2));
        bus2.getBusInfo();
    }
}