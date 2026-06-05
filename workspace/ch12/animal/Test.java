package ch12.animal;

public class Test {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
        launchTime(d);
    }

    static void launchTime(Animal a){
        a.eat();
    }
}
