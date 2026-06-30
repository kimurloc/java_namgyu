package level02.day02;

public class Prob03 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(denom2 % denom1 == 0 || denom1 % denom2 == 0){
            if(denom2 > denom1){
                answer[1] = denom2;
                answer[0] = numer2 + numer1*(denom2/denom1);
                for(int i = 2; i < denom2; i++){
                    if(answer[1] % i == 0 && answer[0] % i == 0){
                        answer[1] /= i;
                        answer[0] /= i;
                    }
                }
            }else{
                answer[1] = denom1;
                answer[0] = numer1 + numer2*(denom1/denom2);
                for(int j = 2; j < denom1; j++){
                    if(answer[1] % j == 0 && answer[0] % j == 0){
                        answer[1] /= j;
                        answer[0] /= j;
                    }
                }
            }
        }else{
            answer[0] = numer1*denom2 + numer2*denom1;
            answer[1] = denom1*denom2;
        }
        return answer;
    }
    void main(){
        /*int[] arr1 = solution(1, 2, 3, 4);
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        int[] arr2 = solution(9, 2, 1, 3);
        for(int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }*/

        // [5, 1] expected - ok
        /*int[] arr = solution(2, 1, 3, 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        int[] arr1 = solution(4, 2, 4, 4);
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
