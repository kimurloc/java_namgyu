package ch11.capsule.ex02;

public class ScoreTest {
    public static void main(String[] args) {
        Score haru = new Score(100, 90, 85);
        /*haru.kor = 100;
        haru.eng = 90;
        haru.math = 85;*/
        //haru.kor = 3000;  // private으로 비정상 접근 제한
        int haruSum = haru.sum();
        double haruAvg = haru.avg();
        System.out.println(haruSum);
        System.out.println(haruAvg);
        //haru.math += 5;
        haruSum = haru.getMath() + 5;
        haru.setMath(haruSum);
        haruAvg = haru.avg();
        System.out.println(haruAvg);

        haru.setMath(haru.getMath()*5);
        haruAvg = haru.avg();
        System.out.println(haruAvg);
    }
}