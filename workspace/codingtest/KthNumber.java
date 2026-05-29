package codingtest;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        int tmp;

        // command[][0]번째에서 command[][1]까지의 배열로 미니배열 생성
        for(int i = 0; i < commands.length; i++) {
            int index;
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            index = commands[i][0] - 1;
            for(int j = 0; j <= commands[i][1] - commands[i][0]; j++) {
                temp[j] = array[index];
                index++;
            }
            // 미니배열 오름차순으로 정렬
            for(int k = 0; k < temp.length; k++) {
                for(int l = k + 1; l < temp.length; l++) {
                    if(temp[k] > temp[l]) {
                        tmp = temp[k];
                        temp[k] = temp[l];
                        temp[l] = tmp;
                    }
                }
            }
            // 정렬된 미니배열에서 command[][2]번쨰로 작은 값이 answer
            answer[i] = temp[commands[i][2] - 1];
        }
        for(int m = 0; m < answer.length; m++) {
            System.out.print(answer[m] + " ");
        }
    }
}
