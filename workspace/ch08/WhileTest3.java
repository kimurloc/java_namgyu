package ch08;

public class WhileTest3 {
    public static void main(String[] args){
        int j = (int) (Math.random()*6 + 1);;
        int count = 1;
        while(j != 6) {
            System.out.println(j);
            j = (int) (Math.random()*6 + 1);
            count++;
        }
        System.out.println(j + ", " + count);
    }
}
