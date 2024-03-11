public class Main1{
    public static void main(String args[]){
        // LinkedList ll=new LinkedList();
        // ll.insertAtFirst(17);
        // ll.insertAtFirst(15);
        // ll.insertAtFirst(8);
        // ll.insertAtLast(30);

        // ll.insertAtIndex(31, 2);
        // System.out.println("Value found at index "+ll.find(31));
        // ll.display();
        // ll.deleteAtLast();
        // ll.display();
        // ll.deleteAtFirst();
        // ll.display();
        // ll.deleteAtIndex(1);
        // ll.display();

        DoublyLinkList ll=new DoublyLinkList();
        ll.insertAtFirst(3);
        ll.insertAtFirst(2);
        ll.insertAtFirst(8);
        ll.insertAtFirst(17);
        ll.insertAtLast(99);
        ll.insertAtIndex(2, 145);
        ll.display();
    }
}


