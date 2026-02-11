package queue;
class Queu {
    int size;
    int front, rear;
    int[] arr;

    Queu(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert element (enqueue)
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1)
            front = 0; // first element
        arr[++rear] = data;
    }

    // Traversal (display elements)
    void traverse() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class traversal_queue {
    public static void main(String[] args) {
        Queu q = new Queu(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.traverse();
    }
}
