package ch13.supercar;

public class DriveTest {
    public static void main(String[] args){
        GasolinCar gcar = new GasolinCar(5);
        HybridCar hcar = new HybridCar(6);
        ElectricCar ecar = new ElectricCar(7);
        PlugInHybridCar phcar = new PlugInHybridCar(8);
        Driver driver = new Driver();

        driver.drive(gcar);
        driver.drive(hcar);
        driver.drive(ecar);
        driver.drive(phcar);
        //driver.charge();
    }
}