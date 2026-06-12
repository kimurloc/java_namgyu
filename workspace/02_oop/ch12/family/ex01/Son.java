package ch12.family.ex01;

public class Son extends Parent{
    Son(String name){
        super(name);
    }

    void play(){
        work();
        System.out.println(name + " play game");
    }

    void sleep(){
        System.out.println(name + " sleep late");
    }

    private void work(){
        System.out.println(name + " work");
    }
}