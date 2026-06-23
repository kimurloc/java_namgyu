package ch02;

import java.util.*;

public class MapTest {
    void main(){
        //Map<String, String> fruits = new HashMap<>();
        Map<String, String> fruits = new TreeMap<>();

        fruits.put("mon", "banana");
        fruits.put("tue", "apple");
        fruits.put("wed", "orange");
        fruits.put("thu", "pineapple");
        fruits.put("fri", "watermelon");

        printFruits(fruits);

        String friFruit = /*(String)*/fruits.get("fri");
        System.out.println(friFruit);
    }

    void printFruits(Map<String, String> fruits){
        /*System.out.println(fruits.get("mon"));
        System.out.println(fruits.get("tue"));
        System.out.println(fruits.get("wed"));
        System.out.println(fruits.get("thu"));
        System.out.println(fruits.get("fri"));*/
        /*for(String key : fruits.keySet()){
            System.out.println(key + " : " + fruits.get(key));
        }*/

        for(Map.Entry<String, String> entry : fruits.entrySet()){
            String key = entry.getKey();
            String fruit = entry.getValue();
            System.out.println(key + " : " + fruit);
        }
    }

    /*void printFruits(String[] fruits) {
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
    void printFruits(LinkedHashSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }*/
}