package ch13.supercar;

public class Driver {
    void drive(SuperCar car){
        car.move();
        /*if(car instanceof ElectricCar){
            ((ElectricCar)car).charge();
        }else if(car instanceof PlugInHybridCar){
            ((PlugInHybridCar)car).charge();
        }*/
        if(car instanceof Chargeable){
            ((Chargeable)car).charge();
        }
    }
}