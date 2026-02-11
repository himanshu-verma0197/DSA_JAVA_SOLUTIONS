class MyQueue {
    int size;
    int front, rear;
    int[] arr;

    MyQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1)
            front = 0;
        arr[++rear] = data;
    }

    void peek() {
        if (front == -1) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }
}

public class peek_queue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();
    }
}
