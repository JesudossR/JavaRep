public class DoublyLinkList{

    public Node head;
    public Node tail;
    public int size;

    public DoublyLinkList(){
        this.size=0;
    }

    public void insertAtFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
        size=size+1;
    }

    public void insertAtLast(int value){
        // 1st Method Note:By using the tail
        // if(tail==null){
        //     insertAtFirst(value);
        //     return;
        // }
        // Node node=new Node(value);
        // tail.next=node;
        // node.prev=tail;
        // node.next=null;
        // tail=node;
        
        // Methode 2: by iterating untill the null value occurs
        Node node=new Node(value);
        Node last=head;
        node.next=null;  
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    public void insertAtIndex(int index,int value){
        Node prev=find(index);
        if(prev==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(value);
        node.next=prev.next;
        prev.next=node;
        node.prev=prev;
        if(node.next!=null){
            node.next.prev=node;
        }
        size++;   
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value== value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }

    public void display(){
        Node temp=head;
        Node last=null;

        while(temp!=null){
            System.out.print(temp.value+ "->");
            last=temp;
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();

        while (last!=null) {
                System.out.print(last.value+"->");
                last=last.prev;
        }
        System.out.print("Start");
        System.out.println();

        System.out.println("Size: "+size);
    }
}
