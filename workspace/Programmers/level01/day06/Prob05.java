package level01.day06;

public class Prob05 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < answer.length; i++){
            int min = -1;
            for(int j = queries[i][0]; j < queries[i][1] + 1; j++){
                if(arr[j] > queries[i][2]){
                    if(min == -1){
                        min = arr[j];
                    }else if(min >= 0 && arr[j] < min){
                        min = arr[j];
                    }
                }
            }
            answer[i] = min;
        }
        return answer;
    }

    void main(){
        int[] arr = {0, 1, 2, 4, 3};
        int[][] arr2D = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        arr = solution(arr, arr2D);
        for(int elem : arr)
            System.out.print(elem + " ");
    }
}