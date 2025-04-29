import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentClass{
    String name;
    int age;
    int semester;

    public void addInfo(String n, int a, int s){
        name= n;
        age= a;
        semester= s;
    }

    public void displayInfo(){
        System.out.println("Name= " + name);
        System.out.println("Age= " + age);
        System.out.println("Semester= " + semester);
    }


    public static void main(String[] args) throws Exception{
        StudentClass std= new StudentClass();
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name: ");
        String name= b.readLine();

        System.out.print("Enter age: ");
        int age=Integer.parseInt(b.readLine());

        System.out.print("Enter semester: ");
        int semester=Integer.parseInt(b.readLine());

        std.addInfo(name, age, semester);
        System.out.println("student Detail");
        std.displayInfo();

    }
    
}
