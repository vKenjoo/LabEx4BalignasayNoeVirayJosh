// Balignasay, Neo Genesis
// Viray, Josh Kenn
// ICS2605
// 1CSF
// Lab Exercise 4 

public class Queue<T> {
    private Object[] array;
    private int size;
    private int front = -1;
    private int rear = -1;
    
    public Queue(int size){
        this.array = new Object[size];
        this.size = size;
    }
    
    public void clear(){
        front = (rear = -1);
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    
    public void enqueue(T newItem){
        if(isFull()){ 
            throw new RuntimeException("Cannot enqueue because the queue is full " + front + " " + rear);
        } 
        
        if(rear == size - 1){
            rear = 0;
        } else if(rear == -1) {
            front = (rear = 0);
        } else {
            rear++;}
        array[rear] = newItem;
    }
    
    public T dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Cannot dequeue because the queue is empty");
        }
        
        //Save the value of front and then increment
        T data = (T) array[front];
        
        if (front == rear) { //to indicate that its the last item
            front = (rear = -1);
        } else if(front == size - 1) {
            front = 0; //for the front to be placed in the end of the array and wrap it to the front
        } else {
            front++;
        }
        return data;
    }
    
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Cannot peek because the queue is empty");
        }
        return (T) array[front];
    }

    public void offer(BTNode<T> root) {
    }
} 