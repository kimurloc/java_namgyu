package level01.day07;

public class Prob03 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for(int i = 0; i < end_num - start_num + 1; i++){
            answer[i] = start_num + i;
        }
        return answer;
    }
    void main(){
        int[] arr = new int[solution(3, 10).length];
        arr = solution(3, 10);
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
