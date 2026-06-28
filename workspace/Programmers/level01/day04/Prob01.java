package level01.day04;

public class Prob01 {
    public int solution(int num, int n) {
        if(num % n == 0)
            return 1;
        return 0;
    }
    void main(){
        solution(98, 2);
        solution(34, 3);
    }
}
