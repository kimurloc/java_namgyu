package ch09;

public class ScoreTest {
    public static void main(String[] args){
        int[] score;
        score = new int[3]; // int[] score = new int[3];
        score[0] = 100;
        score[1] = 90;
        score[2] = 85;
        int sum = score[0] + score[1] + score[2];
        double avg = sum / 3.0;
        System.out.println(Math.round(avg*10) / 10.0);
    }
}
