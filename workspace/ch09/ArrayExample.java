package ch09;

public class ArrayExample {
    public static void main(String[] args) {
        /*int kor = 100;
        int eng = 90;
        int math = 85;
        int sum = kor + eng + math;
        double avg = sum / 3.0;
        System.out.println(avg);
        System.out.println(avg);
        System.out.println(Math.round(avg));
        System.out.println(Math.round(avg * 10) / 10);*/

        int[] scores = {100, 90, 80, 70};
        int sum = 0;
        double avg = 0;
        for(int i : scores) {
            sum += i;
        }
        avg = (double) sum / scores.length;
        System.out.println(sum + " " + avg);

        /*int[] score;
        score = new int[3]; // int[] score = new int[3];
        score[0] = 100;
        score[1] = 90;
        score[2] = 85;
        int sum = score[0] + score[1] + score[2];
        double avg = sum / 3.0;
        System.out.println(Math.round(avg*10) / 10.0);*/

        /*int[] score = {100, 90, 85};
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += score[i];
        }
        double avg = sum / 3.0;
        System.out.println(Math.round(avg*10) / 10.0);*/

        /*Scanner s = new Scanner(System.in);
        System.out.print("enter the array length : ");
        int num = s.nextInt();
        int[] scores = new int[num];
        String[] names = new String[num];
        for(int i = 0; i < num; i++) {
            System.out.print("name :");
            names[i] = s.next();
            System.out.print("score :");
            scores[i] = s.nextInt();
        }
        for(int j = 0; j < scores.length; j++) {
            System.out.println(names[j] + " : " + scores[j]);
        }*/

        /*Scanner s = new Scanner(System.in);   // 구구단
        System.out.print("enter the number : ");
        int num = s.nextInt();
        int[] gugudan = new int[9];
        for(int i = 0; i < gugudan.length; i++) {
            gugudan[i] = num*(i + 1);
            System.out.print(gugudan[i] + " ");
        }*/

        /*System.out.print("enter the number : ");  // while 구구단
        int num = s.nextInt();
        int[] gugudan = new int[9];
        while(num != 0) {
            for(int i = 0; i < gugudan.length; i++) {
                gugudan[i] = num*(i + 1);
                System.out.print(num + "*" + (i + 1)+ "=" + gugudan[i] + " ");
            }
            System.out.println();
            System.out.print("enter the number : ");
            num = s.nextInt();
        }*/

        /*Scanner s = new Scanner(System.in); // while 구구단 개선
        int[] gugudan = new int[9];
        while(true) {
            System.out.print("enter the number : ");
            int num = s.nextInt();
            if(num == 0) {
                break;
            }
            else {
                for(int i = 0; i < gugudan.length; i++) {
                    gugudan[i] = num*(i + 1);
                    System.out.print(num + "*" + (i + 1)+ "=" + gugudan[i] + " ");
                }
            }
            System.out.println();
        }*/

        /*Scanner s = new Scanner(System.in);   // do-while 구구단
        int[] gugudan = new int[9];
        int num = 0;
        do {
            System.out.print("enter the number : ");
            num = s.nextInt();
            if(num == 0) {
                break;
            }
            for(int i = 0; i < gugudan.length; i++) {
                gugudan[i] = num*(i + 1);
                System.out.print(num + "*" + (i + 1)+ "=" + gugudan[i] + " ");
            }
            System.out.println();
        } while(num != 0);*/

        /*Scanner s = new Scanner(System.in);
        int[][] gugudan = new int[8][9];
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                gugudan[i - 2][j - 1] = i*j;
                System.out.print(i + "*" + j + "=" + gugudan[i - 2][j - 1] + " ");
            }
            System.out.println();
        }
        System.out.println(gugudan.length);
        System.out.println(gugudan[1].length);*/
    }
}