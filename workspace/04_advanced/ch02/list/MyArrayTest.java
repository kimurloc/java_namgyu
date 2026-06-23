package ch02.list;

public class MyArrayTest {
    void main(){
        MyArray arr = new MyArray(10);
        //System.out.println(arr);

        for(int i = 0; i < 5; i++){
            arr.append("data" + i);
        }
        System.out.println(arr);

        System.out.println(arr.getElem(0) + ", " + arr.getElem(3));

        arr.delete(2);
        System.out.println(arr);

        arr.append(2, "data5");
        System.out.println(arr);

        arr.append(arr.size(), "data6");
        System.out.println(arr);

        System.out.println(arr.size());

        //arr.append(1, 10);
        //System.out.println(arr.toString());

        //arr.delete(1);
        //System.out.println(arr.toString());

        //System.out.println(arr.getElem(2));
    }
}
