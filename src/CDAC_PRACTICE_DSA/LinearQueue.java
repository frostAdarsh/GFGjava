package CDAC_PRACTICE_DSA;

public class LinearQueue {

    int[] queue;
    int front;
    int rear;
    int size;

    public  LinearQueue(int size){
        this.size =size;
        queue = new int[size];
        front =0;
        rear = -1;
    }

    public boolean isEmpty(){
        return  rear <front;
    }
    public boolean isFull(){
        return rear == size-1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full! cannot insert "+data);
            return;
        }
        queue[++rear] = data;
        System.out.println(data + " enqueued ");
    }

    public int dequeue(){
         if(isEmpty()){
             System.out.println("Queue is empty noting to remove");
             return -1;

         }

         int removed = queue[front];

         for(int i=0;i<rear;i++){
             queue[i] = queue[i+1];
         }
         rear--;
        System.out.println(removed + " dequeued");
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! No peek value.");
            return -1;
        }
        return queue[front];
    }

    public void  display(){
        if(isEmpty()){
            System.out.println("Queeu is empty");
            return ;
        }

        System.out.println("queue contents: ");
        for (int i=front;i<=rear;i++){
            System.out.println(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);

        q.enqueue(10);
        q.enqueue(20);

        q.peek();
        q.display();
        q.dequeue();
    }

}




