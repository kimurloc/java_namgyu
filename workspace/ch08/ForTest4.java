package ch08;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("number?");
        int num = s.nextInt();
        for(int i = 1; i < 10; i++) {
            System.out.println(num + "*" + i + " = " + num*i);
        }
    }
}
