package level01.day02;

public class Prob05 {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int i = 0;
        while(i < my_string.length()){
            if(i < s || i >= s + overwrite_string.length()){
                answer += my_string.charAt(i);
            }else{
                answer += overwrite_string.charAt(i - s);
            }
            i++;
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }
}
