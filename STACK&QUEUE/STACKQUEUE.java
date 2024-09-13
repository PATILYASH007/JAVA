import java.util.Scanner;
interface Stack{
    int push(int ele);
    void pop();
    void display1();
}
interface Queue{
    int enqueue(int ele);
    void dequeue();
    void display2();
}                    
class StackQueue implements Stack,Queue{
    int maxSize;
    int []arr;
    int top;
    int rear;
    StackQueue(int s){
        arr=new int [s];
        maxSize=s;
        top=-1;
        rear=-1;
    }
    public int push(int ele){
        if(arr.length==maxSize){
            System.out.println("-------Stack Overflow-------");
            return -1;
        }
        else{
            arr[top]=ele;
            top++;
            System.out.print("Element" + ele + "is Pushed");
            return 0;
        }
    }
    public void pop(){
        if(arr.length==-1){
            System.out.println("-------Stack Underflow-------");
        }
        else{
            System.out.print("Element is Poped");
            top--;
        }
    }
    public void display1(){
        for(int i:arr){
            System.out.print("Following are stack elements:"+i);
        }

    }
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
    }
}
--------------this code is incomplete-----------------------
