package ch08;

import java.util.Scanner;

public class ForTest6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] gugudan = new int[8][9];
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                gugudan[i - 2][j - 1] = i*j;
                System.out.print(i + "*" + j + "=" + gugudan[i - 2][j - 1] + " ");
            }
            System.out.println();
        }
        System.out.println(gugudan.length);
        System.out.println(gugudan[1].length);
    }
}
