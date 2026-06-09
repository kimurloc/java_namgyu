package ch13.family.ex02;

public abstract class Parent {
    String name;

    Parent(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name + " eat");
    }

    /*void play(){
        System.out.println(name + " play");
    }*/

    void sleep(){
        System.out.println(name + " sleep");
    }

    abstract void play();
}
