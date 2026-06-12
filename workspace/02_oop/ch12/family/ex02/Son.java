package ch12.family.ex02;

public class Son extends Parent{
    Son(String name){
        super(name);
    }
    String name = "son2";
    void hello(){
        System.out.println("hello from " + name);
    }
}
