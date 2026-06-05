package ch12.car;

public class Bus extends Car{
    private int passengerCount = 0;
    private String num;
    private String type;
    private int price;
    private int maxPassengerCount;

    public Bus(String model, String num, int price, String type, int maxPassengerCount) {
        super(model);
        this.num = num;
        this.price = price;
        this.type = type;
        this.maxPassengerCount = maxPassengerCount;
    }

    void ride(){
        if(passengerCount < maxPassengerCount) {
            passengerCount++;
        }else{
            System.out.println("bus full");
        }
    }

    void leave(){
        passengerCount--;
    }

    /*void stop(){
        //stop();
        super.stop();
    }*/

    void getBusInfo(){
        System.out.println("bus : " + num + "(" + type + ")");
        System.out.println("number of bus passenger : " + passengerCount + "/" + maxPassengerCount);
    }
}
