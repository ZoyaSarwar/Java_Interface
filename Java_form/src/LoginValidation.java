import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginValidation extends JDialog{
    public LoginValidation(JFrame parent) {
        // Set dialog properties
        super(parent, "Login", true); 
        setSize(300, 200);
        setLocationRelativeTo(parent); // Center to the parent frame

        // Set Layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Username Label
        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(usernameLabel, gbc);

        // Username TextField
        JTextField usernameField = new JTextField(15);
        gbc.gridx = 1;
        add(usernameField, gbc);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        // Password TextField
        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        add(passwordField, gbc);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;


        // Create Submit button
        JButton submitButton = new JButton("Submit");
        buttonPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                String[] credentials= new String[2];
                credentials[0] = username;
                credentials[1] = password;

                Controller user = new Controller();
                String response = user.login(credentials);

                // Validate Login
                if (response == "Login successful") {
                    new Application();
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(LoginValidation.this,
                            response,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Create Cancel button
        JButton cancelButton = new JButton("Cancel");
        buttonPanel.add(cancelButton);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame(); 
                dispose();  
            }
        });

        add(buttonPanel, gbc);

        setVisible(true);
    }
}
