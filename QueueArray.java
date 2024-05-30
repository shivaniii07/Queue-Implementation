public class QueueArray
{ 
    static class Queue{
       static int[] arr;
       static int size;
       static int rear;
       static int front;
        Queue(int n)
        {
           arr=new int[n];
           size=n;
           rear=-1;
           front=-1;
        }
        // is empty
        public static boolean isEmpty()
        {
            return rear==-1&& front==-1;
        }
        //  fulll
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }

        // add operation
        public static void add(int data)
        {
           if(isFull())
           {
              System.out.println("Queue is full");
              return;
           }
        //    add 1 element
           if(front==-1)
           {
            front=0;
           }
           rear=(rear+1)%size;
           arr[rear]=data;
          
        }

        // remove operation
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int res=arr[front];
            // last el delete
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
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
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(5);
        q.add(7);
        q.add(14);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}