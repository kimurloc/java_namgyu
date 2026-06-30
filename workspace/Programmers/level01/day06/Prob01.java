package level01.day06;

public class Prob01 {
    public int[] solution(int[] num_list) {
        int idx = num_list.length;
        int[] answer = new int[idx + 1];
        for(int i = 0; i < idx; i++){
            answer[i] = num_list[i];
        }
        if(num_list[idx - 1] > num_list[idx - 2]){
            answer[idx] = num_list[idx - 1] - num_list[idx - 2];
        }else{
            answer[idx] = num_list[idx - 1]*2;
        }
        return answer;
    }
}
