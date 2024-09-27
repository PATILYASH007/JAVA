import java.util.*;
import java.io.*;
public class ThreadA extends Thread {
    public void run() 
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("A: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread A was interrupted!!!!");
            }
        }
    }
}