package stack;
// using array

public class addelement {
      static  class stack{
            int size;
             int arr[];
            int top;

        stack(int size) {
                 this.size=size;
                 arr=new int[size];
                 top=-1;
    }

             void push (int data){
                if(top==size-1){
                    System.out.println("stack is overflow");
                    return;
                }
                     top++;
                    arr[top]=data;
                
                }
                
             
            void pop()
            {
                if (top==-1){
                    System.out.println("stack underflow");
                }
                   else{
                       top--;

                   }

            }
            void peek(){
                
                if (top==-1){
                    System.out.println("stack underflow");
                }
                else{
                    System.out.println(arr[top]);
                }

            }
               void display(){
                    if(top==-1){
                        return;
                    }
                    for (int i = 0; i <=top; i++) {
                        System.out.println(" "+ arr[i]);
                        
                    }

                }
              
            
        }
    
        public static void main(String[] args) {
        
            stack st =new stack(5);
            st.push(10);
              st.push(20);
                st.push(30);
                st.display();
                st.pop();
             
                  st.display();
                     st.peek();

            
        }
    }
