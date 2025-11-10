package pca2.set2;

import java.awt.*;
import java.awt.event.*;

// Create a frame and implement a simple calculator with buttons b1 and b2 for addition and
// subtraction respectively and 3 textfield for the 2 inputs and output

public class SimpleCalculator extends Frame implements ActionListener {
    // Declare text fields
    private TextField input1, input2, output;

    // Declare buttons
    private Button b1, b2;

    // Constructor
    public SimpleCalculator() {
        // Set frame properties
        setTitle("Simple Calculator");
        setSize(450, 350);
        setBackground(new Color(240, 240, 240));

        Panel mainPanel = new Panel();
        mainPanel.setLayout(new GridLayout(5, 2, 15, 15)); // Increased gaps

        // Add insets (padding) using BorderLayout
        setLayout(new BorderLayout());

        Panel topPadding = new Panel();
        topPadding.setPreferredSize(new Dimension(0, 20));
        topPadding.setBackground(new Color(240, 240, 240));

        Panel bottomPadding = new Panel();
        bottomPadding.setPreferredSize(new Dimension(0, 20));
        bottomPadding.setBackground(new Color(240, 240, 240));

        Panel leftPadding = new Panel();
        leftPadding.setPreferredSize(new Dimension(30, 0));
        leftPadding.setBackground(new Color(240, 240, 240));

        Panel rightPadding = new Panel();
        rightPadding.setPreferredSize(new Dimension(30, 0));
        rightPadding.setBackground(new Color(240, 240, 240));

        Label label1 = new Label("First Number:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));
        Label label2 = new Label("Second Number:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));
        Label label3 = new Label("Result:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        input1 = new TextField(15);
        input1.setFont(new Font("Arial", Font.PLAIN, 14));
        input2 = new TextField(15);
        input2.setFont(new Font("Arial", Font.PLAIN, 14));
        output = new TextField(15);
        output.setFont(new Font("Arial", Font.BOLD, 14));
        output.setEditable(false); // Output field is read-only
        output.setBackground(Color.WHITE);

        // Create buttons
        b1 = new Button("Addition (+)");
        b1.setFont(new Font("Arial", Font.BOLD, 13));
        b2 = new Button("Subtraction (-)");
        b2.setFont(new Font("Arial", Font.BOLD, 13));

        // Set button colors
        b1.setBackground(new Color(144, 238, 144)); // Light green
        b2.setBackground(new Color(255, 182, 193)); // Light pink

        b1.addActionListener(this);
        b2.addActionListener(this);

        mainPanel.add(label1);
        mainPanel.add(input1);
        mainPanel.add(label2);
        mainPanel.add(input2);
        mainPanel.add(new Label("")); // Empty cell for spacing
        mainPanel.add(new Label("")); // Empty cell for spacing
        mainPanel.add(b1);
        mainPanel.add(b2);
        mainPanel.add(label3);
        mainPanel.add(output);

        add(topPadding, BorderLayout.NORTH);
        add(bottomPadding, BorderLayout.SOUTH);
        add(leftPadding, BorderLayout.WEST);
        add(rightPadding, BorderLayout.EAST);
        add(mainPanel, BorderLayout.CENTER); // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Make frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double result = 0;

            if (e.getSource() == b1) {
                // Addition
                result = num1 + num2;
                output.setText(String.valueOf(result));
            } else if (e.getSource() == b2) {
                // Subtraction
                result = num1 - num2;
                output.setText(String.valueOf(result));
            }

        } catch (NumberFormatException ex) {
            // Handle invalid input
            output.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
        System.out.println("Simple Calculator Started!");
        System.out.println("Enter two numbers and click:");
        System.out.println("  - Addition (+) for sum");
        System.out.println("  - Subtraction (-) for difference");
    }
}
