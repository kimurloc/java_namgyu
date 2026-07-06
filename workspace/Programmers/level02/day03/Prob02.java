package level02.day03;

public class Prob02 {
    public int solution(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        int answer = array[array.length / 2];
        return answer;
    }
    void main(){
        int[] arr1 = {1, 2, 7, 10, 11};
        System.out.println(solution(arr1));
        int[] arr2 = {9, -1, 0};
        System.out.println(solution(arr2));
    }
}
