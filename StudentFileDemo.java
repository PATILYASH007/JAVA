import java.io.*;
import java.util.Scanner;

class StudentInfo {

    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("studentInfo.dat"))) {

            System.out.println("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Class: ");
            String studentClass = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Weight: ");
            float weight = sc.nextFloat();
            System.out.println("Enter Height (in meters): ");
            float height = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter City: ");
            String city = sc.nextLine();
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();

            dos.writeInt(rollNo);
            dos.writeUTF(studentClass);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            System.out.println("Student details have been successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void displayStudentDetails() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("studentInfo.dat"))) {
            int rollNo = dis.readInt();
            String studentClass = dis.readUTF();
            int age = dis.readInt();
            float weight = dis.readFloat();
            float height = dis.readFloat();
            String city = dis.readUTF();
            String phone = dis.readUTF();

            System.out.println("\nStudent Details:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Class: " + studentClass);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("City: " + city);
            System.out.println("Phone: " + phone);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

public class StudentFileDemo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        studentInfo.getStudentDetails();

        studentInfo.displayStudentDetails();
    }
}
