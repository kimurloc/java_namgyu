package ch02.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    void main(){
        Queue queue = new LinkedList();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(40);
        queue.add(50);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        //System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
