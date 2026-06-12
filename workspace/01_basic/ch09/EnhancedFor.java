package ch09;

public class EnhancedFor {
    public static void main(String[] args){
        int[] scores = {100, 90, 80, 70};
        int sum = 0;
        double avg = 0;
        for(int i : scores) {
            sum += i;
        }
        avg = (double) sum / scores.length;
        System.out.println(sum + " " + avg);
    }
}
