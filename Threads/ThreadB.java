import java.util.*;
import java.io.*;
public class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread B was interrupted!!!!!!");
            }
        }
    }
}
