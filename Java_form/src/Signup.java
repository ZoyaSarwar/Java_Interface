import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame {

    // Constructor
    public Signup() {
        // Set frame properties
        setTitle("Signup Screen");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(new BorderLayout());

        // Create a panel for the form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add Name field
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        // Add Password field
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        formPanel.add(passwordField, gbc);

        // Add Email field
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        // Add Phone Number field
        JLabel phoneLabel = new JLabel("Phone Number:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(phoneLabel, gbc);

        JTextField phoneField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(phoneField, gbc);

        // Add Address field
        JLabel addressLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(addressLabel, gbc);

        JTextArea addressField = new JTextArea(4, 20);
        addressField.setLineWrap(true);
        addressField.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(addressField);
        gbc.gridx = 1;
        formPanel.add(scrollPane, gbc);

        // Add Gender field
        JLabel genderLabel = new JLabel("Gender:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(genderLabel, gbc);

        JPanel genderPanel = new JPanel();
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        gbc.gridx = 1;
        formPanel.add(genderPanel, gbc);

        // Add Submit Button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user entered data 
                String[] user = new String[6];
                user[0] = nameField.getText();
                user[1] = new String(passwordField.getPassword());
                user[2] = emailField.getText();
                user[3] = phoneField.getText();
                user[4] = addressField.getText();
                String gender; 
                if (maleButton.isSelected()) {
                    gender = maleButton.getText();
                } else {
                    gender = femaleButton.getText();
                } 
                user[5] = gender; 

                Controller reg = new Controller();
                String response =  reg.registration(user);
                    JOptionPane.showMessageDialog(Signup.this,
                        "Name: " + user[0] + "\n" +
                        "Password: " + user[1] + "\n" +
                        "Email: " + user[2] + "\n" +
                        "Phone #: " + user[3] + "\n" +
                        "Address " + user[4] + "\n" +
                        "Gender: " + user[5] + "\n" +
                        "Message: " + response,
                        "Registration Successful", JOptionPane.INFORMATION_MESSAGE);

                        
                    new  Application();

                
            }
        });

        // Add form panel to the frame
        add(formPanel, BorderLayout.CENTER);

        // Set frame visibility
        setVisible(true);
    }

    // // Main method for testing
    // public static void main(String[] args) {
    //     new Signup();
    // }
}
