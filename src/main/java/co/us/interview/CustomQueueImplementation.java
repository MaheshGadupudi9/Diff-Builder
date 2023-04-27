package co.us.interview;

import java.util.Arrays;

public class CustomQueueImplementation {
    public static void main(String[] args) {
        //FIFO
        Queue qu = new Queue(5);
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);

        System.out.println(qu.size());
        System.out.println(qu.get(0));
        System.out.println(qu.get(1));
        System.out.println(qu.get(2));
        System.out.println("qu = " + qu);
        System.out.println(qu.isEmpty());
        System.out.println(qu.isFull());
        System.out.println(qu.getFront());
        System.out.println(qu.getRear());
        System.out.println(qu.remove(1));
        System.out.println(qu.getRear());
        System.out.println(qu.size());
        System.out.println("qu = " + qu);
    }
}

class Queue {
    private final Integer[] bucket;
    private final int front;
    private int size;
    private int current;
    private int rear;

    Queue() {
        this(20);
    }

    Queue(int size) {
        this.size = size;
        this.current = -1;
        this.front = 0;
        this.bucket = new Integer[size];
    }

    public void add(int value) {
        if (isFull()) {
            return; // throw an exception
        }
        ++current;
        bucket[current] = value;
        rear = current;
    }

    public int get(int index) {
        if (isEmpty() || index >= size || index < 0) {
            return Integer.MAX_VALUE; // throw an exception
        }
        return bucket[index];
    }

    public int remove(int index) {
        if (isEmpty() || index >= size && index < 0) {
            return Integer.MAX_VALUE; // throw an exception
        }
        int temp = bucket[index];
        // should move values between indexes
        reAdjust(index);
        --current;
        rear=current;
        return temp;
    }

    private void reAdjust(int index) {
        for (int i = index; (i < current); i++) {
            bucket[i] = bucket[i + 1];
        }
        bucket[current] = null;
    }

    public boolean isFull() {
        return current == (size - 1);
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public int size() {
        return current + 1;
    }

    public int getFront() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return bucket[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return bucket[rear];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "bucket=" + Arrays.toString(bucket) +
                '}';
    }
}



