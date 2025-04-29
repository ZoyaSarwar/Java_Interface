public class PersonalInfo {
    private String name;
    private String fatherName;
    private String phoneNumber;
    private String address;
    private int age;
    private String gender;

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]+") && name.length() < 255) {
            this.name = name;
        } else {
            System.out.println("Invalid name format. Please provide a name with alphabets only and length less than 255 characters.");
        }
    }

    // Getter and setter methods for fatherName
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        if (fatherName.matches("[a-zA-Z]+") && fatherName.length() < 255) {
            this.fatherName = fatherName;
        } else {
            System.out.println("Invalid name format. Please provide a name with alphabets only and length less than 255 characters.");
        }
    }

    // Getter and setter methods for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // Phone number validation (simple validation for demonstration)
        if (phoneNumber.matches("\\d{11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number format. Please provide a 11-digit number.");
        }
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Age validation (simple validation for demonstration)
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Please provide an age between 0 and 100.");
        }
    }

    // Getter and setter methods for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        // Gender validation (simple validation for demonstration)
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("other")) {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender. Please provide 'male', 'female', or 'other'.");
        }
    }   
}
