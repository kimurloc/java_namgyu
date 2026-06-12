package ch12.family.ex01;

public class Daughter extends Parent {
    Daughter(String name){
        super(name);
    }
    void play(){
        makeUp();
        System.out.println(name + " go out");
    }

    private void makeUp(){
        System.out.println(name + " make up");
    }
}
