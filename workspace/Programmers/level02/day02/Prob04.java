package level02.day02;

public class Prob04 {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            numbers[i] *= 2;
        }
        int[] answer = numbers;
        return answer;
    }
}
