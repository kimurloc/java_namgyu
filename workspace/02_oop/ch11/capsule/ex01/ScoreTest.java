package ch11.capsule.ex01;

public class ScoreTest {
    public static void main(String[] args) {
        Score haru = new Score();
        haru.kor = 100;
        haru.eng = 90;
        haru.math = 85;
        int haruSum = haru.sum();
        double haruAvg = haru.avg();
        System.out.println(haruSum);
        System.out.println(haruAvg);
    }
}