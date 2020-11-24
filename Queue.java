/*
 Queue implementation using linked list
 */
package queue;

public class Queue {
    Node front;
    Node rear;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
        
    }
/*
 enqueue function code
 */    
    public void enqueue(int data){
        Node n= new Node (data);
        if (front == null) 
        {
            front = rear = n;
            return;
        }
                
        rear.next = n;
        rear = n;  
    }
/*
 dequeue function code
 */ 
    public void dequeue(){
        if (isempty())
        {
            System.out.println("Queue is Empty!");
            return;
        }
        
        front = front.next;
        
        if (front == null)
        {
            rear = null;
        }
    }
/*
 isempty function code
 */     
    public boolean isempty(){
        return front == null;
    }
/*
 display function code
 */     
     public void display ()
    {
        Node t = front;
        
        while (t != null)
        {
            System.out.println("data = " +t.data);
            t = t.next;
        }
        
    }
 /*
 main function code
 */ 
    public static void main(String[] args) {
        Queue queue = new Queue();
               
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        System.out.println("after dequeue");     
        queue.dequeue();
        queue.display();    
    }
    
}
