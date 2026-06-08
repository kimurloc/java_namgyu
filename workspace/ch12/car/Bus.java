package ch12.car;

public class Bus extends Car{
    private int passengerCount = 0;
    private String num;
    private String type;
    private int price = 0;
    private int maxPassengerCount;
    private static int totalMoney;
    //private int passengerAge;

    public Bus(String model, String num, String type, int maxPassengerCount) {
        super(model);
        this.num = num;
        //this.price = price;
        this.type = type;
        this.maxPassengerCount = maxPassengerCount;
    }

    void ride(int passengerAge){
        if(passengerAge < 0 || passengerAge > 120){
            System.out.println("passenger must be between 0~120 age");
        }else{
            incPassengerNum(passengerAge);
        }
    }

    void incPassengerNum(int passengerAge){
        if(passengerCount < maxPassengerCount) {
            if(passengerAge >= 65){
                passengerCount++;
            }else if(passengerAge > 19){
                price += 1500;
                totalMoney += 1500;
                passengerCount++;
            }else{
                price += 700;
                totalMoney += 700;
                passengerCount++;
            }
        }else{
            System.out.println("bus full, passenger cannot ride anymore");
        }
    }

    void leave(int passengerNum){
        if(passengerNum > passengerCount){
            passengerCount = 0;
        }else{
            passengerCount -= passengerNum;
        }
    }

    /*void stop(){
        //stop();
        super.stop();
    }*/

    void getBusInfo(){
        System.out.println("bus : " + num + "(" + type + ")");
        System.out.println("number of bus passenger : " + passengerCount + "/" + maxPassengerCount);
        System.out.println(num + " money : " + price);
        System.out.println("total money : " + totalMoney);
    }
}
