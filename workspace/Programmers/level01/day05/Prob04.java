package level01.day05;

public class Prob04 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = num_list[0];
        int mul = num_list[0];
        for(int i = 1; i < num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        if(sum*sum > mul)
            answer = 1;
        return answer;
    }
    void main(){
        int[] arr1 = {3, 4, 5, 2, 1};
        int[] arr2 = {5, 7, 8, 3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
