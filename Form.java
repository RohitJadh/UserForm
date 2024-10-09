import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JButton submitButton;

    public UserForm() {
        // Set up the frame
        setTitle("User Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        submitButton = new JButton("Submit");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Empty cell
        add(submitButton);

        // Add action listener for the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                JOptionPane.showMessageDialog(null, "Name: " + name + "\nEmail: " + email);
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserForm());
    }
}
