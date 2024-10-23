package org.example;

public class MyCircularQueue {

    //  Question:
//    Implement the MyCircularQueue class:
//    MyCircularQueue(k) Initializes the object with the size of the queue to be k.
//    int Front() Gets the front item from the queue. If the queue is empty, return -1.
//    int Rear() Gets the last item from the queue. If the queue is empty, return -1.
//    boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
//    boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
//    boolean isEmpty() Checks whether the circular queue is empty or not.
//    boolean isFull() Checks whether the circular queue is full or not.
    private final int[] queue;
    private final int capacity;
    private int front;
    private int rear;
    private int size;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.front = 0;
        this.rear = -1;
        this.capacity = k;
        this.size = 0;

    }

    public static void main(String[] args) {
        System.out.println(0 % 3);
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        // Using modulus operator to increment rear and wrap around to the front as it excedes the capacity it will wrap around to the front
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        // Using modulus operator to increment front and wrap around to the front as it excedes the capacity it will wrap around to the front
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
