package ch13.supercar;

public class GasolinCar extends SuperCar{
    public GasolinCar(int zero100) {
        super(zero100);
    }

    @Override
    void move() {
        super.move();
        System.out.println("driving by gasolin");
    }
}
