public class QueueData {
    int ptr=0;
    int data[];
    static final int default_size=10;

    public QueueData(){
        this(default_size);
    }
    public QueueData(int size){
        this.data=new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[ptr++]=value;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int pop=data[0];
        for(int i=1;i<data.length;i++){
            data[i-1]=data[i];
        }
        return pop;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return data[0];
    }
    
    public void display(){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    public boolean isFull(){
        return ptr==data.length;
    }

    public boolean isEmpty(){
        return ptr==0;
    }
}
