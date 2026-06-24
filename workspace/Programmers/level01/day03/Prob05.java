package level01.day03;

public class Prob05 {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if(answer >= 2*a*b){
            return answer;
        }else{
            return 2*a*b;
        }
    }
    void main(){
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }
}
