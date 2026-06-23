package level02.day02;

public class Prob02 {
    public int solution(int num1, int num2) {
        int answer;
        if(num1 == num2){
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }

    void main(){
        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));
    }
}
