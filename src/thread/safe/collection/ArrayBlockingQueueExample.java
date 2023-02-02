package thread.safe.collection;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue=new ArrayBlockingQueue<>(4);

        arrayBlockingQueue.add(1);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);
        arrayBlockingQueue.add(4);
        arrayBlockingQueue.offer(5);

        System.out.println(arrayBlockingQueue);



    }
}
