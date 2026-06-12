package ch10;

public class MethodSolve {
    static int sumMethod(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double avgMethod(int[] array) {
        double avg = sumMethod(array) / (double)array.length;
        return Math.round(avg*10) / 10.0;
    }

    /*static void printSumMethod(int num, String name) {
        System.out.println(name + " : " + num);
    }

    static void printAvgMethod(double num, String name) {
        System.out.println(name + " : " + num);
    }*/

    static void printMethod(String name, int[] array) {
        System.out.println(name + "'s sum : " + sumMethod(array) + ", avg : " + avgMethod(array));
    }

    static void printAllMethod(int[] arr1, int[] arr2, int[] arr3) {
        int sum = sumMethod(arr1) + sumMethod(arr2) + sumMethod(arr3);
        double avg = (double)sum / (arr1.length + arr2.length + arr3.length);
        System.out.println("All sum : " + sum + ", avg : " + Math.round(avg*10) / 10.0);
    }

    void main() {
        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        printMethod("haru", haruScore);
        printMethod("namu", namuScore);
        printMethod("brong", brongScore);

        printAllMethod(haruScore, namuScore, brongScore);
    }

    /*static int sumMethod(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double avgMethod(int sum, int num) {
        double avg = (double)sum / num;
        return avg;
    }

    static void printSumMethod(int num, String name) {
        System.out.println(name + " : " + num);
    }

    static void printAvgMethod(double num, String name) {
        System.out.println(name + " : " + num);
    }

    static void printAllMethod(int[] arr1, int[] arr2, int[] arr3) {
        int sum = sumMethod(arr1) + sumMethod(arr2) + sumMethod(arr3);
        System.out.println("All sum : " + sum);
        double avg = (double)sum / (arr1.length + arr2.length + arr3.length);
        System.out.println("All avg : " + avg);
    }

    void main() {
        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        printSumMethod(sumMethod(haruScore), "haru's sum");
        printAvgMethod(avgMethod(sumMethod(haruScore), haruScore.length), "haru's avg");
        printSumMethod(sumMethod(namuScore), "namu's sum");
        printAvgMethod(avgMethod(sumMethod(namuScore), namuScore.length), "namu's avg");
        printSumMethod(sumMethod(brongScore), "brong's sum");
        printAvgMethod(avgMethod(sumMethod(brongScore), brongScore.length), "brong's avg");

        printAllMethod(haruScore, namuScore, brongScore);
    }*/
}