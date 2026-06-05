package ch12.family.ex02;

public class Test {
    public static void main(String[] args){
        Parent p = new Parent("parent");
        Son s = new Son("son");
        p.hello();
        s.hello();
    }
}