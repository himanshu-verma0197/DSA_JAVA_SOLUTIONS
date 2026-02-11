package stack;

public class stack_impl_linkedlist {

    class Node{
        int data;
        Node next;
        

        Node(int data){
        this.data=data;
        this.next=null;
       
        }
      
    }
         Node top;
         void push(int data){
            Node newNode=new Node(data);
            newNode.next=top;
             top=newNode;
         }
         void remove(){
               if(top==null){
                System.out.println("stack is empty");
                return;
               }
                System.out.println("Popped: " + top.data);
    top = top.next;
             
         }
         void display(){
            while(top!=null)
            {
                System.out.print(top.data+" ");
                top=top.next;
            }
    
         }
         public static void main(String[] args) {
             stack_impl_linkedlist st=new stack_impl_linkedlist();
             st.push(10);
             st.push(20);
             st.push(30);
            st.remove();
             st.display();
         }
}
