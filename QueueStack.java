import java.util.*;
public class QueueStack {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

    //    isEmpty operation
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add operation
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }

            return s1.pop();
        }

        // peek operation
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queu is empty");
                return -1;
            }

            return s1.peek(); 
        }
    }
    public static void main(String[] args) {
       Queue q=new Queue();
       q.add(7);
       q.add(14);
       q.add(19);
       System.out.println(q.remove());
       System.out.println(q.peek());
    }
    
}
