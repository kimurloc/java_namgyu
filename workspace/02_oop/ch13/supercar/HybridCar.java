package ch13.supercar;

public class HybridCar extends SuperCar{
    /*public HybridCar() {
        super();
    }*/

    public HybridCar(int zero100) {
        super(zero100);
    }

    @Override
    void move() {
        super.move();
        System.out.println("driving by elec & oil");
    }
}
