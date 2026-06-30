package level01.day05;

public class Prob05 {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                odd += num_list[i] + "";
            }else{
                even += num_list[i] + "";
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
    void main(){
        int[] arr1 = {3, 4, 5, 2, 1};
        int[] arr2 = {5, 7, 8, 3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
