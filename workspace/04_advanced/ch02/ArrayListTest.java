package ch02;

import java.util.*;

public class ArrayListTest {
    void main(){
        //String[] fruits = {"banana", "apple", "orange", "pineapple", "watermelon"};
        //ArrayList<String> fruits = new ArrayList<String>();
        //LinkedList<String> fruits = new LinkedList<>();
        //Vector<String> fruits = new Vector<>();
        //HashSet<String> fruits = new HashSet<>();
        //TreeSet<String> fruits = new TreeSet<>();
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("watermelon");

        printFruits(fruits);
    }

    void printFruits(String[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }

    void printFruits(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    void printFruits(LinkedList<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruits(Vector<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruits(HashSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruits(TreeSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    /*void printFruits(LinkedHashSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }*/
}
