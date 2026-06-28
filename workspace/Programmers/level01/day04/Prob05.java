package level01.day04;

public class Prob05 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        /*switch(flag){
            case true:
                answer = a + b;
                break;
            case false:
                answer = a - b;
                break;
        }*/
        if(flag){
            answer = a + b;
        }else{
            answer = a - b;
        }
        return answer;
    }

    void main(){
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }
}
