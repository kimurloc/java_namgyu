package ch09;

public class ScoreArrayTest {
    public static void main(String[] args){
        int[] score = {100, 90, 85};
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += score[i];
        }
        double avg = sum / 3.0;
        System.out.println(Math.round(avg*10) / 10.0);
    }
}
