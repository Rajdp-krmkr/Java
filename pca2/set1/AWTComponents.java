package pca2.set1;

import java.awt.*;
import java.awt.event.*;

public class AWTComponents extends Frame implements ActionListener, ItemListener {
    // Components
    private Button button;
    private Checkbox checkbox1, checkbox2;
    private TextField textField;
    private Label label;
    private List list;
    private Choice choice;
    private TextArea textArea;
    private Scrollbar scrollbar;
    private Panel panel;

    public AWTComponents() {
        // Set frame properties
        setTitle("AWT Components Demo");
        setSize(600, 500);
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        // 1. Frame (this class extends Frame)
        
        // 2. Panel - container for grouping components
        panel = new Panel();
        panel.setBackground(Color.YELLOW);
        panel.setPreferredSize(new Dimension(550, 60));
        Label panelLabel = new Label("This is a Panel containing components");
        panel.add(panelLabel);

        // 3. Button
        button = new Button("Click Me!");
        button.addActionListener(this);
        panel.add(button);
        add(panel);

        // 4. Checkbox
        Label checkboxLabel = new Label("Select options:");
        add(checkboxLabel);
        
        checkbox1 = new Checkbox("Java", true);
        checkbox1.addItemListener(this);
        add(checkbox1);
        
        checkbox2 = new Checkbox("Python", false);
        checkbox2.addItemListener(this);
        add(checkbox2);

        // 5. TextField
        Label textFieldLabel = new Label("Enter text:");
        add(textFieldLabel);
        
        textField = new TextField(20);
        textField.setText("Type here...");
        add(textField);

        // 6. Label
        label = new Label("Status: Ready");
        label.setForeground(Color.BLUE);
        add(label);

        // 7. List
        Label listLabel = new Label("Select from List:");
        add(listLabel);
        
        list = new List(4, false);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        add(list);

        // 8. Choice (Dropdown)
        Label choiceLabel = new Label("Choose:");
        add(choiceLabel);
        
        choice = new Choice();
        choice.add("Option A");
        choice.add("Option B");
        choice.add("Option C");
        choice.add("Option D");
        add(choice);

        // 9. TextArea
        Label textAreaLabel = new Label("Multi-line text:");
        add(textAreaLabel);
        
        textArea = new TextArea("This is a text area.\nYou can type multiple lines here.", 5, 30);
        add(textArea);

        // 10. Scrollbar
        Label scrollbarLabel = new Label("Scrollbar:");
        add(scrollbarLabel);
        
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100);
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Scrollbar value: " + scrollbar.getValue());
            }
        });
        add(scrollbar);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            String selected = choice.getSelectedItem();
            String listItem = list.getSelectedItem();
            
            StringBuilder message = new StringBuilder("Button clicked! ");
            if (!text.isEmpty()) {
                message.append("TextField: ").append(text).append(" | ");
            }
            if (selected != null) {
                message.append("Choice: ").append(selected).append(" | ");
            }
            if (listItem != null) {
                message.append("List: ").append(listItem);
            }
            
            label.setText(message.toString());
            textArea.append("\n" + message.toString());
        }
    }

    // Handle checkbox state changes
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1 || e.getSource() == checkbox2) {
            String status = "Selected: ";
            if (checkbox1.getState()) status += "Java ";
            if (checkbox2.getState()) status += "Python ";
            label.setText(status);
        }
    }

    public static void main(String[] args) {
        new AWTComponents();
        System.out.println("AWT Components Demo Started");
        System.out.println("This demo includes:");
        System.out.println("1. Frame (main window)");
        System.out.println("2. Panel (yellow container)");
        System.out.println("3. Button (Click Me!)");
        System.out.println("4. Checkboxes (Java, Python)");
        System.out.println("5. TextField (input field)");
        System.out.println("6. Label (status display)");
        System.out.println("7. List (multi-item list)");
        System.out.println("8. Choice (dropdown)");
        System.out.println("9. TextArea (multi-line text)");
        System.out.println("10. Scrollbar (horizontal)");
    }
} 