package pca2.set2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Simple Calculator using Swing components with buttons for addition and subtraction

public class SimpleCalcWSwing extends JFrame implements ActionListener {
    // Declare Swing text fields
    private JTextField input1, input2, output;

    private JButton b1, b2;

    public SimpleCalcWSwing() {
        setTitle("Simple Calculator - Swing");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2, 15, 15));
        mainPanel.setBackground(new Color(245, 245, 245));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40)); // Add padding

        JLabel label1 = new JLabel("First Number:");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label1.setForeground(new Color(60, 60, 60));

        JLabel label2 = new JLabel("Second Number:");
        label2.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label2.setForeground(new Color(60, 60, 60));

        JLabel label3 = new JLabel("Result:");
        label3.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label3.setForeground(new Color(60, 60, 60));

        input1 = new JTextField(15);
        input1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        input1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        input2 = new JTextField(15);
        input2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        input2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        output = new JTextField(15);
        output.setFont(new Font("Segoe UI", Font.BOLD, 15));
        output.setEditable(false); // Output field is read-only
        output.setBackground(new Color(255, 255, 255));
        output.setForeground(new Color(0, 100, 0));
        output.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0, 150, 0), 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        b1 = new JButton("Addition (+)");
        b1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b1.setBackground(new Color(76, 175, 80)); // Material Green
        b1.setForeground(Color.WHITE);
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b2 = new JButton("Subtraction (-)");
        b2.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b2.setBackground(new Color(244, 67, 54)); // Material Red
        b2.setForeground(Color.WHITE);
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b1.setBackground(new Color(67, 160, 71));
            }

            public void mouseExited(MouseEvent e) {
                b1.setBackground(new Color(76, 175, 80));
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b2.setBackground(new Color(229, 57, 53));
            }

            public void mouseExited(MouseEvent e) {
                b2.setBackground(new Color(244, 67, 54));
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);

        mainPanel.add(label1);
        mainPanel.add(input1);
        mainPanel.add(label2);
        mainPanel.add(input2);

        mainPanel.add(new JLabel(""));
        mainPanel.add(new JLabel(""));

        mainPanel.add(b1);
        mainPanel.add(b2);
        mainPanel.add(label3);
        mainPanel.add(output);

        // Add main panel to frame
        add(mainPanel);

        // Make frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText().trim());
            double num2 = Double.parseDouble(input2.getText().trim());
            double result = 0;

            if (e.getSource() == b1) {
                // Addition
                result = num1 + num2;
                output.setText(String.valueOf(result));
                output.setForeground(new Color(0, 100, 0)); // Green for success
            } else if (e.getSource() == b2) {
                // Subtraction
                result = num1 - num2;
                output.setText(String.valueOf(result));
                output.setForeground(new Color(0, 100, 0)); // Green for success
            }

        } catch (NumberFormatException ex) {
            output.setText("Invalid Input!");
            output.setForeground(Color.RED); // Red for error
        }
    }

    public static void main(String[] args) {
        // Use SwingUtilities for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalcWSwing();
            }
        });

        System.out.println("=== Simple Calculator (Swing Version) ===");
        System.out.println("Features:");
        System.out.println("  ✓ Modern Swing UI components");
        System.out.println("  ✓ Styled buttons with hover effects");
        System.out.println("  ✓ Clean input fields with borders");
        System.out.println("  ✓ Addition and Subtraction operations");
        System.out.println("  ✓ Error handling for invalid inputs");
    }
}
