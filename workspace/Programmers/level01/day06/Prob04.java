package level01.day06;

public class Prob04 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < queries.length; i++){
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        answer = arr;
        return answer;
    }
    void main(){
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{0, 3}, {1, 2}, {1, 4}};
        int[] result = solution(arr, arr2D);
        for(int elem : result){
            System.out.print(elem + " ");
        }
    }
}