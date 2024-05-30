public class QueueLinkedlist {

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
           this.data=data;
           this.next=null;
        }
    }
    static class Queue{
       static Node head=null;
       static Node tail=null;
      
    //    isEmpty() operation
       public static boolean isEmpty()
       {
         return (head==null && tail==null);
       }

    //    add operation

       public static void add(int data)
       {
         Node newnode=new Node(data);
         if(head==null)
         {
            head=tail=newnode;
            return;
         }
         tail.next=newnode;
         tail=newnode;
       }

        // remove operation

        public static int remove()
        { 
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int res=head.data; 
            if(head==tail)
            {
               head=tail=null;
            }
            else{
                head=head.next;
            }
           
            return res;
        }

        // peek operation
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(7);
        q.add(14);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
    
}
