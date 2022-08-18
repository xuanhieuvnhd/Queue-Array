public class MyQueue {
    int capacity;
    int[] queueArr;
    int head;
    int tail = -1;
    int currentSize =0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Tran ra ! Khong the them phan tu: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phan tu " + item + " duoc day vao hang doi !");
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Khong the xoa phan tu khoi hang doi");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Da hoan thanh ! xoa: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Da hoan thanh ! xoa: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
