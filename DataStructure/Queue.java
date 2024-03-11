public class Queue {
    public static void main(String[] args) {
            QueueData qd=new QueueData(5);
            qd.push(12);
            qd.push(5);
            qd.push(8);
            qd.push(6);
            qd.push(33);
            qd.display();
            System.out.println(qd.pop());
            System.out.println(qd.peek());
    }
}
