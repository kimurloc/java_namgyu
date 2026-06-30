package level01.day05;

public class Prob02 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            if(included[i])
                answer += a + d*i;
        }
        return answer;
    }
    void main(){
        boolean[] arr = {true, false, false, true, true};
        System.out.println(solution(3, 4, arr));
        boolean[] arr2 = {false, false, false, true, false, false, false};
        System.out.println(solution(7, 1, arr2));
    }
}
