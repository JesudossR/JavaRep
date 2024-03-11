public class Stack
 {
        public static void main(String args[])
        {
            StackData sd=new StackData(5);
            sd.push(12);
            sd.push(5);
            sd.push(8);
            sd.push(6);
            sd.push(33);
            sd.display();
            System.out.println(sd.pop());
            System.out.println(sd.peek());
        }

}
