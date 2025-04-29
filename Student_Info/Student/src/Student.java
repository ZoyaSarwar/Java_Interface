public class Student extends PersonalInfo{
    private String rollNum;

    // Getter and setter methods for roll number
    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        if (rollNum.matches("\\d{4}")) {
            this.rollNum = rollNum;
        } else {
            System.out.println("Invalid Roll number format. Please provide a 11-digit number.");
        }
    }
    
}
