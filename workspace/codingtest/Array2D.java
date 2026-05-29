package codingtest;

public class Array2D {
    // https://school.programmers.co.kr/learn/courses/30/lessons/87390
    public static void main(String[] args) {
        int n = 4;
        long left = 7;
        long right = 14;
        int[][] array2D = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i <= j) {
                    array2D[i][j] = j + 1;
                } else {
                    array2D[i][j] = i + 1;
                }
            }
        }
        int[] answer = new int[(int)(right - left) + 1];
        for(int k = 0; k < right - left + 1; k++) {
            answer[k] = array2D[(int)(left + k) / n][(int)(left + k) % n];
        }

        /*int[] array = new int[n*n];
        for(int k = 0; k < n*n; k++) {
            array[k] = array2D[k / n][k % n];
        }

        int[] answer = new int[right - left + 1];
        for(int l = 0; l < right - left + 1; l++) {
            answer[l] = array[left + l];
            System.out.print(answer[l] + " ");
        }*/


        /*int n = 3;
        int left = 2;
        int right = 5;
        int[][] array2D = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i <= j) {
                    array2D[i][j] = j + 1;
                } else {
                    array2D[i][j] = i + 1;
                }
            }
        }
        int[] array = new int[n*n];
        for(int k = 0; k < n*n; k++) {
            array[k] = array2D[k / n][k % n];
        }

        int[] answer = new int[right - left + 1];
        for(int l = 0; l < right - left + 1; l++) {
            answer[l] = array[left + l];
            System.out.print(answer[l] + " ");
        }*/
    }
}