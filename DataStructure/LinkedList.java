public class LinkedList{

    public Node head;
    public Node tail;
    public int size;

    public LinkedList(){
        this.size=0;
    }

    public void insertAtFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size=size+1;
    }

    public void insertAtLast(int value){
        if(tail==null){
            insertAtFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size=size+1;
    }

    public void insertAtIndex(int value,int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }
        if(index==size){
            insertAtLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size=size+1;
    }

    public int deleteAtFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size=size-1;
        return value;
    }

    public int deleteAtLast(){
      if(size<=1){
            return deleteAtFirst();
      }
      Node secondLast=get(size-2);
      int value=tail.value;
      tail=secondLast;
      tail.next=null;
      size=size-1;
      return value;
    }

    public int deleteAtIndex(int index){
        if(index==0){
            return deleteAtFirst();
        }
        if(index==size-1){
            return deleteAtLast();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        size=size-1;
        return value;
    }
    
    public int find(int value){
        Node node=head;
        int index=0;
        while(node.next!=null){
            if(node.value== value){
                return index;
            }
            node=node.next;
            index=index+1;
        }
        return -1;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    
    public class Node {
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();
        System.out.println("Size:"+size);
    }
}