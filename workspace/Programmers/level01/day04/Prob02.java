package level01.day04;

public class Prob02 {
    public int solution(int number, int n, int m) {
        if(number % n == 0 && number % m == 0){
            return 1;
        }
        return 0;
    }

    void main(){
        solution(60, 2, 3);
        solution(55, 10, 5);
    }
}
