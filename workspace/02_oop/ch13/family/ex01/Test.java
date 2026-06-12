package ch13.family.ex01;

public class Test {
    public static void main(String[] args) {
        //Parent p = new Parent("namu");
        Parent p = new Son("haru");
        //Daughter d = new Daughter("brong");
        //dailySchedule(p);
        dailySchedule(p);
       // dailySchedule(d);
        String name = "haru";
        //hello(name);
    }

    private static void dailySchedule(Parent p){
        p.eat();
        p.play();
        if(p instanceof Son){
            Son s = (Son) p;
            s.work();
        }
        p.sleep();
    }

    /*private static void dailySchedule(Son s){
        s.eat();
        s.play();
        s.sleep();
    }

    private static void dailySchedule(Daughter d){
        d.eat();
        d.play();
        d.sleep();
    }*/

    static void hello(String name){
        System.out.println("hello " + name);
    }
}