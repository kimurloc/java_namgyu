package ch08;

public class DoWhileTest {
    public static void main(String[] args){
        int j = 0;
        int count = 0;
        do {
            j = (int) (Math.random()*6 + 1);
            System.out.println(j);
            count++;
        } while (j != 6);
        System.out.println(j + ", " + count);
    }
}
