package ch13.supercar;

public class ElectricCar extends SuperCar implements Chargeable{
    public ElectricCar(int zero100) {
        super(zero100);
    }

    @Override
    void move() {
        super.move();
        System.out.println("driving by electric");
    }

    public void charge(){
        System.out.println("charging...");
    }
}
