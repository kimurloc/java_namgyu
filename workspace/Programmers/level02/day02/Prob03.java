package level02.day02;

public class Prob03 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(denom2 % denom1 == 0 || denom1 % denom2 == 0){
            if(denom2 > denom1){
                answer[1] = denom2;
                answer[0] = numer2 + numer1*(denom2/denom1);
            }else{
                answer[1] = denom1;
                answer[0] = numer1 + numer2*(denom1/denom2);
            }
        }else{
            answer[0] = numer1*denom2 + numer2*denom1;
            answer[1] = denom1*denom2;
        }
        return answer;
    }
    void main(){
        System.out.println(solution(1, 2, 3, 4).toString());
    }
}
