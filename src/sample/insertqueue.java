class Queue {
    int size;
    int front, rear;
    int[] arr;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert (enqueue)
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1)
                front = 0; // first element
            rear++;
            arr[rear] = data;
            System.out.println(data + " inserted into queue");
        }
    }

    // Display queue
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class insertqueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}
