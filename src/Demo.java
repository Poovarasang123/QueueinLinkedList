public class Demo {
    public static void main(String[] args) {
        QueueinLL <Integer> qll = new QueueinLL<>();

        qll.enqueue(8);
        qll.enqueue(7);
        qll.enqueue(3);
       qll.enqueue(2);
       System.out.println(qll.dequeue());
       System.out.println(qll.isEmpty());
       System.out.println(qll.elementAtFirst());   
    }
}
