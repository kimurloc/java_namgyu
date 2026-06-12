package ch12.family.ex02;

public class Parent {
    String name;
    Parent(String name){
        this.name = name;
    }
    void hello(){
        System.out.println("hello from " + name);
    }
}
