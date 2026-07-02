package level01.day07;

public class Prob04 {
    public int[] solution(int n) {
        int count = 1;
        int num = n;
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = 3*num + 1;
            }
            count++;
        }
        int[] answer = new int[count];
        answer[0] = n;
        for(int i = 1; i < count; i++){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = 3*n + 1;
            }
            answer[i] = n;
        }
        return answer;
    }
    void main(){
        int[] arr = new int[solution(10).length];
        arr = solution(10);
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
