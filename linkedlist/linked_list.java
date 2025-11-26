package linkedlist;
public class linked_list {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // inserting element at the first
    Node head;

    void insertAtFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
     void insertAtLast(String data){
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) {  
        temp = temp.next;
    }
    temp.next = newNode;
}
    void deleteAtFirst(){
         if(head==null)
         {
            System.out.println("the list is empty");
         }
         else{
            head=head.next;
         }
    }
      void deleteAtLast(){
     if (head == null) {
        System.out.println("The list is empty");
        return;
    }

    // if only 1 node
    if (head.next == null) {
        head = null;
        return;
    }

    // travel to second last node
    Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }

    // now temp is 2nd last node
    temp.next = null;
}

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        linked_list node = new linked_list();
        node.insertAtFirst("10");
        node.insertAtFirst("hello");
        node.insertAtFirst("10");
        node.insertAtLast("last");
        node.deleteAtFirst();
        node.deleteAtLast();
        node.printList();

    }
}
