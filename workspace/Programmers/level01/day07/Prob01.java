package level01.day07;

public class Prob01 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j < queries[i][1] + 1; j++){
                if(j % queries[i][2] == 0){
                    arr[j] += 1;
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
        return answer;
    }
    void main() {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] arr2D = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        arr = solution(arr, arr2D);
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
