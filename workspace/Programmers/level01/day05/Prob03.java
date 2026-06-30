package level01.day05;

public class Prob03 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && b == c){
            answer = (a + b + c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
        }else if(a == b || b == c || a == c){
            answer = (a + b + c)*(a*a + b*b + c*c);
        }else{
            answer = a + b + c;
        }
        return answer;
    }
    void main(){
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }
}
