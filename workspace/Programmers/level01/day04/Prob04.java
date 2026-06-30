package level01.day04;

public class Prob04 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        /*if(ineq == ">" && eq == "="){
            if(n >= m)
                answer = 1;
        }else if(ineq == "<" && eq == "="){
            if(n <= m)
                answer = 1;
        }else if(ineq == ">" && eq == "!"){
            if(n > m)
                answer = 1;
        }else{
            if(n < m)
                answer = 1;
        }*/
        if(ineq.equals(">") && eq.equals("=")){
            if(n >= m)
                answer = 1;
        }else if(ineq.equals("<") && eq.equals("=")){
            if(n <= m)
                answer = 1;
        }else if(ineq.equals(">") && eq.equals("!")){
            if(n > m)
                answer = 1;
        }else{
            if(n < m)
                answer = 1;
        }
        return answer;
    }
    void main(){
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }
}
