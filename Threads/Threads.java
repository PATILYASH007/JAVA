import java.util.*;
import java.io.*;
public class Threads {
    public static void main(String[] args) {
        ThreadA A = new ThreadA(); 
        ThreadB B = new ThreadB(); 
        A.start();
        B.start();
    }
}
