import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {

    // Constructor
    public Application() {
        // Set frame properties
        setTitle("Login Screen");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Add a menu bar with dropdown options
        JMenuBar menuBar = new JMenuBar();

        // Create "File" menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newOption = new JMenuItem("New");
        JMenuItem openOption = new JMenuItem("Open");
        JMenuItem exitOption = new JMenuItem("Exit");
        fileMenu.add(newOption);
        fileMenu.add(openOption);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitOption);

        // Create "Edit" menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutOption = new JMenuItem("Cut");
        JMenuItem copyOption = new JMenuItem("Copy");
        JMenuItem pasteOption = new JMenuItem("Paste");
        editMenu.add(cutOption);
        editMenu.add(copyOption);
        editMenu.add(pasteOption);

        // Create "Help" menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutOption = new JMenuItem("About");
        helpMenu.add(aboutOption);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Add the menu bar to the frame
        setJMenuBar(menuBar);

        // Set Layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Fetch list of cities
        List<String> cities = PakistanCities.getCities();

        // Create a dropdown (JComboBox) with cities
        JComboBox<String> cityDropdown = new JComboBox<>(cities.toArray(new String[0]));

        // Add dropdown 
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("                         Select City:"), gbc);
    

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(cityDropdown, gbc);

        // Add ActionListener to handle dropdown selection
        cityDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCity = (String) cityDropdown.getSelectedItem();
                JOptionPane.showMessageDialog(Application.this, "You selected: " + selectedCity);
            }
        });

        // Add a success message in the center
        JLabel successMessage = new JLabel("You are successfully logged in to the Application", SwingConstants.CENTER);
        successMessage.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(successMessage, gbc);


        // Set frame visibility
        setVisible(true);
    }
}

