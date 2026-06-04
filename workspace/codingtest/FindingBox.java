package codingtest;

public class FindingBox {
    public static void main(String[] args) {
        int n = 13;
        int w = 3;
        int num = 6;
        int[][] storage = new int[n / w + 1][w];
        for(int i = 0; i < n / w + 1; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < w; j++) {
                    storage[i][j] = j + 1 + i*w;
                }
            }else{
                for(int j = 0; j < w; j++) {
                    storage[i][w - j - 1] = j + 1 + i*w;
                }
            }
        }
        int answer = 0;
        /*while(n > w) {
            n -= w;
            answer++;
        }*/
    }
}
