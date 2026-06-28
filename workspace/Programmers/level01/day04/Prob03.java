package level01.day04;

public class Prob03 {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) {
            for(int i = 1; i < n + 1; i++) {
                if(i % 2 == 1)
                    answer += i;
            }
        }else{
            for(int j = 2; j <= n; j += 2){
                answer += j*j;
            }
        }
        return answer;
    }
    void main(){
        System.out.println(solution(7));
        System.out.println(solution(10));
    }
}
