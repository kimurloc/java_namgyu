package ch11.capsule.ex02;

public class Score {
    private int kor;
    private int eng;
    private int math;

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    Score(int kor, int eng, int math) {
        if(kor > 100 || kor < 0) {
            System.out.println("kor score error");
        }else{
            this.kor = kor;
        }
        if(eng > 100 || eng < 0) {
            System.out.println("eng score error");
            return;
        }else{
            this.eng = eng;
        }
        if(math > 100 || math < 0) {
            System.out.println("math score error");
            return;
        }else{
            this.math = math;
        }
    }

    int sum() {
        return kor + eng + math;
    }

    double avg() {
        return Math.round(sum() / 3.0 * 100) / 100.0;
    }
}