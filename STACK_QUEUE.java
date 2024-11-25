import java.util.Scanner;

interface stack {
    void push();
    void pop();
    void displaystack();
}

interface queue {
    void enqueue();
    void dequeue();
    void displayqueue();
}

class StackQueue implements stack, queue {

    Scanner sc= new Scanner(System.in);
    int StackSize;

    //*************************************************************************************
    int[] arr;
    void setStackData(){
        System.out.println("Enter size of stack u want to create: ");
        StackSize=sc.nextInt();
        arr= new int[StackSize];
        System.out.printf("Stack of %d size is created successfully!",StackSize);

    }
    int top =-1;

    public void push(){
        if(top==StackSize-1){
            System.out.println("Stack is full cannot push!");
        }
        else{
            System.out.println("Enter the number to push: ");
            top = top +1;
            arr[top]= sc.nextInt();
            System.out.printf("Element %d is successfully inserted",arr[top]);
        }
    }
    public void pop(){
        if(top ==-1){
            System.out.println("Stack is empty! cannot delete!");
        }
        else{
            System.out.printf("Element %d popped successfully",arr[top]);
            top = top -1;
        }
    }

    public void displaystack(){
        if(top==-1){
            System.out.println("Stack empty!");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(" "+arr[i]);
            }
        }

    }
//********************************************************************************************

    int front=-1;
    int rear=-1;
    int queuesize;
    int[] arr2;
    void setQueueData() {
        System.out.println("Enter the size of queue you want to create: ");
        queuesize = sc.nextInt();
        arr2 = new int[queuesize]; // Initialize the array dynamically
        System.out.printf("Queue of side %d is created successfully!",queuesize);
    }


    public void enqueue(){
        if(rear==queuesize-1){
            System.out.println("queue is full!");
        }
        else{
            System.out.println("Enter element to enqueue: ");
            if(front==-1){
                front=0;
            }
            rear=rear+1;
            arr2[rear]=sc.nextInt();
            System.out.printf("element %d enqueud successfully!",arr2[rear]);
        }
    }

    public void dequeue(){
        if(rear==-1 || rear<front){
            System.out.println("Queue is empty!!");
        }
        else{
            System.out.printf("element %d is dequed successfully!",arr2[front]);
            front=front+1;

        }
    }

    public void displayqueue(){
        if(rear==-1 || rear<front){
            System.out.println("empty!!");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(" "+arr2[i]);
            }
        }
    }
}

public class STACK_QUEUE {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int choice;
        StackQueue s1=new StackQueue();
        do{
            System.out.println("1.stack");
            System.out.println("2.queue");
            System.out.println("3.exit");
            System.out.println("enter your choice: ");
            choice= sc.nextInt();

            if(choice==1){
                int choice2;
                s1.setStackData();

                do{
                    System.out.println();
                    System.out.println("1.Push");
                    System.out.println("2.Pop");
                    System.out.println("3.Display");
                    System.out.println("4.exit");
                    System.out.println("enter choice: ");
                    choice2=sc.nextInt();
                    if(choice2==1){
                        s1.push();
                    }
                    else if(choice2==2){
                        s1.pop();
                    }
                    else if(choice2==3){
                        s1.displaystack();
                    }
                    else{
                        System.out.println("Invalid choice!");
                    }
                }while(choice2!=4);

            }
            else if(choice==2){
                s1.setQueueData();
                int choice3;
                do{
                    System.out.println();
                    System.out.println("1.Enqueue");
                    System.out.println("2.Dequeue");
                    System.out.println("3.Display");
                    System.out.println("4.Exit");
                    System.out.println("Enter choice: ");
                    choice3=sc.nextInt();

                    if(choice3==1){
                        s1.enqueue();
                    }
                    else if(choice3==2){
                        s1.dequeue();
                    }
                    else if(choice3==3){
                        s1.displayqueue();
                    }
                    else{
                        System.out.println("Invalid choice!");
                    }
                }while(choice3!=4);
            }
        }while(choice!=3);



    }
}