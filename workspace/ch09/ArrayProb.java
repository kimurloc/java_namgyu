package ch09;

public class ArrayProb {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 7, 2, 1, 8, 6, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};

        // print all elements of array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // what is same array between arr2, arr3, arr4
        /*boolean isEqual = true;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] != arr3[i]) {
                isEqual = false;
            }
        }
        System.out.println("arr2 == arr3 ? : " + isEqual);

        isEqual = true;
        for(int i = 0; i < arr2.length; i++) {
            if(arr3[i] != arr4[i]) {
                isEqual = false;
            }
        }
        System.out.println("arr3 == arr4 ? : " + isEqual);

        isEqual = true;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] != arr4[i]) {
                isEqual = false;
            }
        }
        System.out.println("arr2 == arr4 ? : " + isEqual);*/

        boolean isEqual1 = true;
        boolean isEqual2 = true;
        boolean isEqual3 = true;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] != arr3[i]) {
                isEqual1 = false;
            }
            if(arr3[i] != arr4[i]) {
                isEqual2 = false;
            }
            if(arr2[i] != arr4[i]) {
                isEqual3 = false;
            }
        }
        System.out.println("arr2 == arr3 ? : " + isEqual1);
        System.out.println("arr3 == arr4 ? : " + isEqual2);
        System.out.println("arr2 == arr4 ? : " + isEqual3);

        // print max-min value of array
        int max, min;
        min = max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max : " + max + " min : " + min);

        // sort array in ascending order
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // sort array in descending order
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}