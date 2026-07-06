package level02.day03;

public class Prob03 {
    public int solution(int[] array) {
        int answer = 1;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int count = 1;
        for(int k = 1; k < array.length; k++){
            if(array[k] == array[k - 1]){
                count++;
                if(count > answer){
                    answer = count;
                }else if(count == answer){
                    answer = -1;
                }
            }else{
                count = 1;
            }
        }
        return answer;
    }
    void main(){
        //int[] arr = {1, 2, 3, 3, 3, 4};
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3};
        System.out.println(solution(arr));
    }
}
