package ch02.list;

public class PerformanceTest {
    void main(){
        int times = 100;
        MyArray list = new MyArray();
        long start = System.currentTimeMillis();
        addFirst(list, times);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    void addFirst(MyArray list, int times){
        for(int i = 0; i < times; i++){
            list.append(0, "data" + i);
        }
    }
}
