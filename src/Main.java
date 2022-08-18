public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(5);
        myQueue.dequeue();
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(44);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(13);
        myQueue.dequeue();
    }
}
