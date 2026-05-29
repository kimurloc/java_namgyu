package ch10;

public class OverloadingExample {
    void main() {
        int[] scores = {89, 78, 79};
        System.out.println(toString(scores));

        double[] scores2 = {12.0, 45.6};
        System.out.println(toString(scores2));

        String[] names = {"haru", "namu", "brong"};
        System.out.println(toString(names));
    }

    String toString(int[] arr) {
        String result = "{";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i < arr.length - 1) {
                result += ", ";
            } else {
                result += "}";
            }
        }
        return result;
    }

    String toString(double[] arr) {
        String result = "{";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i < arr.length - 1) {
                result += ", ";
            } else {
                result += "}";
            }
        }
        return result;
    }

    String toString(String[] arr) {
        String result = "{";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i < arr.length - 1) {
                result += ", ";
            } else {
                result += "}";
            }
        }
        return result;
    }
}
