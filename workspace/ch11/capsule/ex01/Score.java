package ch11.capsule.ex01;

public class Score {
    int kor;
    int eng;
    int math;

    int sum() {
        return kor + eng + math;
    }

    double avg() {
        return Math.round(sum() / 3.0 * 100) / 100.0;
    }
}