package ch13.supercar;

public class PlugInHybridCar extends SuperCar implements Chargeable{
    public PlugInHybridCar(int zero100) {
        super(zero100);
    }

    @Override
    void move() {
        super.move();
    }

    public void charge(){
        System.out.println("charging...");
    }
}
