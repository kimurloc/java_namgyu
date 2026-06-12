package ch14;

import java.util.Arrays;

class ResizableArray{
    private String[] elements;
    private int size;

    public ResizableArray(int initialCapacity){
        elements = new String[initialCapacity];
        size = 0;
    }

    public String toString(){
        return Arrays.toString(elements);
    }

    public void add(String elems){
        if(size == elements.length){
            String[] tempList = new String[elements.length*2];
            for(int i = 0; i < elements.length; i++){
                tempList[i] = elements[i];
            }
            elements = tempList;
        }
        elements[size] = elems;
        size++;
    }

    public String get(int index){
        return elements[index];
    }

    /*public void delete(int index){
        elements[index] = null;
    }*/
}

public class ArrayTest {
    public static void main(String[] args){
        ResizableArray list = new ResizableArray(2);
        //String[] list = new String[2];

        //list[0] = "Apple";
        //list[1] = "Banana";
        //list[2] = "Orange";
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.add("Lemon");
        list.add("Pineapple");

        System.out.println(list.get(1));
        /*list.delete(1);
        System.out.println(list.toString());*/

        /*String[] tempList = new String[list.length*2];
        for(int i = 0; i < list.length; i++){
            tempList[i] = list[i];
        }
        list = tempList;

        list[2] = "Orange";*/

        //System.out.println(Arrays.toString(list));
        System.out.println(list.toString());
    }
}
