public class Main {
    public static void main(String[] args) {

        // Create a Student object
        Student student = new Student();
        
        // // Set student information using setter methods
        student.setName("Aisha");
        student.setFatherName("Ahmed");
        student.setPhoneNumber("12341234567");
        student.setAddress("Islambad");
        student.setAge(21);
        student.setGender("Female");
        student.setRollNum("01235");


        // // Display student information
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Father's Name: " + student.getFatherName());
        System.out.println("Phone Number: " + student.getPhoneNumber());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Roll Number: " + student.getRollNum());

    }
}
