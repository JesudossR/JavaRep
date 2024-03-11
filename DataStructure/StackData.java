
public class StackData{

    int ptr=-1;
    int data[];
    static final int default_size=10;

    public  StackData(){
        this(default_size);
    }

    public  StackData(int size){
        this.data=new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=value;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        // int remove=data[ptr];
        // ptr--;
        // return remove;
        return data[ptr--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return data[ptr];
    }


    public void display(){
        for(int i=data.length-1;i>=0;i--){
            System.out.println(data[i]);
        }
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

}
