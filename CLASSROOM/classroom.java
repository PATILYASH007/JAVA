class Classroom1
{
    String class_name;
    String [] student;
    Classroom1(String cs,String s[])
    {
        class_name=cs;
        student=s;
    }
    void Display()
    {
        System.out.println("Class name : "+class_name);
        System.out.println("Name of students in class : ");
        int no=student.length;
        for (int i=0;i<no;i++)
        {
            System.out.println(student[i]);
        }
        System.out.println("Class Strength : "+no);
    }
}
public class Classroom
{
    public static void main(String[] args)
    {
        String c="JAVA";
        String st[]={"yash","sonali"};
        Classroom1 clas = new Classroom1(c, st);
        clas.Display();
    }
}
