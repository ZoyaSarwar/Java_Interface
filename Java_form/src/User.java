public class User {
    private String message;

    public String login(String[] credentials) {
        String name = credentials[0];
        String password = credentials[1];
        try{
            if ( name.equals("admin") && password.equals("admin")) {   
                this.message = "Login successful";
            } else {  
                this.message = "Invalid user name or password";
            }
    
            return this.message;
    
        } catch (Exception e) {
            this.message = "Something went wrong, please try again later!";
            return this.message;
        }
    
    }

    // public String create(String[]  info){

    //     try (Connection connection = DatabaseConnection.getConnection()) {
            
    //         String sql = "INSERT INTO user (Username, password, email, phone, address, gender) VALUES (?, ?, ?, ?, ?, ?)";
            
    //         PreparedStatement statement = connection.prepareStatement(sql);

    //         statement.setString(1, info[0]);
    //         statement.setString(2, info[1]);
    //         statement.setString(3, info[2]);
    //         statement.setString(4, info[3]);
    //         statement.setString(5, info[4]);
    //         statement.setString(6, info[5]);

    //         statement.executeUpdate();

    //         this.message = "Registration Successful";
    //         // return this.message;

    //     } catch (SQLException e) {

    //         this.message =  e.getMessage();
    //         // return this.message;

    //     }

    //     return this.message;

    // }

}
