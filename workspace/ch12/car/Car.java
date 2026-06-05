package ch12.car;

public class Car {
    String model;
    int speed;
    int gear;

    Car(String model){
        this.model = model;
    }

    void speedUp() {
        speed += 10;
        System.out.println("accelerating! speed now : " + speed + "km/h");
    }

    void speedDown() {
        speed -= 10;
        System.out.println("decelerating.. speed now : " + speed + "km/h");
    }

    void gearUp() {
        gear++;
        System.out.println("1 gear up! gear now : " + gear);
    }

    void gearDown() {
        gear--;
        System.out.println("1 gear down.. gear now : " + gear);
    }

    void start() {
        System.out.println(model + " start driving");
        gearUp();
        speedUp();
    }

    void stop() {
        System.out.println("stop driving");
        while(speed > 0) {
            speedDown();
        }
        gear = 0;
    }

}