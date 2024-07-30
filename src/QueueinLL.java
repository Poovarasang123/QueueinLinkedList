public class QueueinLL <T>{
    class Node{
        T data;
        Node next;

    Node(T val){
        data = val;
        next = null;
    }
   }
   QueueinLL(){
    front = null;
    rear = null;
   }
   Node front , rear;
   public void enqueue(T val){
    Node newNode = new Node(val);
    if(front==null)
        front = newNode;
    else
        rear.next = newNode;
    rear = newNode;
   }
   public T dequeue(){
    if(front==null)
        throw new IndexOutOfBoundsException("Queue is empty");
    T temp = front.data;
    front = front.next;
    if(front == null)
        rear = null;
    return temp;
   }

   Boolean isEmpty(){
    return front==null;
   }

   public T elementAtFirst(){
    if(front==null)
        throw new IndexOutOfBoundsException("Queue is empty");
    return front.data;
   }
}
