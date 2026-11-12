package Week1.Day9;

 class Stack {
    int[] arr;
    int top = -1;
    int capacity;

    Stack(int capacity){
        this.capacity =  capacity;
        arr = new int[capacity];
    }
    void push(int x){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(isEmpty())return -1;
        return arr[top];

        }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top ==capacity - 1;
    }  
}

public class StackWarmup{
    public static void main(String args[]){
       Stack s = new Stack(3);

       s.push(10);
       s.push(30);
       s.push(50);
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.peek());
}
}



