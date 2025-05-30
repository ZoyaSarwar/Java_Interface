
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class PakistanCities {
    
    // public static List<String> getCities() {
    //     return Arrays.asList(
    //         "Karachi", 
    //         "Lahore", 
    //         "Islamabad", 
    //         "Rawalpindi", 
    //         "Faisalabad", 
    //         "Multan"
    //     );
    // }
    
    public static List<String> getCities() {
        // List to hold city names
        List<String> cities = new ArrayList<>();
    
        // Establish connection to database and execute query
        try (Connection connection = DatabaseConnection.getConnection()) {
            // SQL Query
            String query = "SELECT City FROM cities";
            PreparedStatement statement = connection.prepareStatement(query);
    
            // Execute query
            try (ResultSet resultSet = statement.executeQuery()) {
                // Iterate through the result set and add cities to the list
                while (resultSet.next()) {
                    cities.add(resultSet.getString("City"));
                }
            }
    
        } catch (SQLException e) {
            e.printStackTrace();
            // Optionally, log the error or return an error message to the caller
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        return cities; // Return the list of cities
    }

}

