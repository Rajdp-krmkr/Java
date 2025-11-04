package pca2.set1;

import java.awt.*;
import java.awt.event.*;

public class AWTLayoutManager {

    // 1. FlowLayout Demo
    static class FlowLayoutDemo extends Frame {
        public FlowLayoutDemo() {
            setTitle("FlowLayout Demo");
            setSize(400, 200);
            
            // FlowLayout arranges components left to right, top to bottom
            setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            
            add(new Button("Button 1"));
            add(new Button("Button 2"));
            add(new Button("Button 3"));
            add(new Button("Button 4"));
            add(new Button("Button 5"));
            add(new TextField("Text Field", 15));
            add(new Label("This is a Label"));
            
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            });
            
            setVisible(true);
        }
    }

    // 2. BorderLayout Demo
    static class BorderLayoutDemo extends Frame {
        public BorderLayoutDemo() {
            setTitle("BorderLayout Demo");
            setSize(400, 300);
            
            // BorderLayout divides frame into 5 regions: NORTH, SOUTH, EAST, WEST, CENTER
            setLayout(new BorderLayout(10, 10));
            
            add(new Button("NORTH"), BorderLayout.NORTH);
            add(new Button("SOUTH"), BorderLayout.SOUTH);
            add(new Button("EAST"), BorderLayout.EAST);
            add(new Button("WEST"), BorderLayout.WEST);
            add(new Button("CENTER"), BorderLayout.CENTER);
            
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            });
            
            setVisible(true);
        }
    }

    // 3. GridLayout Demo
    static class GridLayoutDemo extends Frame {
        public GridLayoutDemo() {
            setTitle("GridLayout Demo - Calculator Style");
            setSize(300, 300);
            
            // GridLayout arranges components in a grid (rows x columns)
            setLayout(new GridLayout(4, 4, 5, 5));
            
            // Creating a simple calculator layout
            String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
            };
            
            for (String text : buttons) {
                Button btn = new Button(text);
                if (text.equals("=")) {
                    btn.setBackground(Color.GREEN);
                } else if (text.equals("C")) {
                    btn.setBackground(Color.RED);
                } else if ("/*-+".contains(text)) {
                    btn.setBackground(Color.YELLOW);
                }
                add(btn);
            }
            
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            });
            
            setVisible(true);
        }
    }

    // 4. CardLayout Demo
    static class CardLayoutDemo extends Frame implements ActionListener {
        private CardLayout cardLayout;
        private Panel cardPanel;
        private Button nextButton, prevButton;

        public CardLayoutDemo() {
            setTitle("CardLayout Demo");
            setSize(400, 300);
            setLayout(new BorderLayout());
            
            // CardLayout shows one component at a time, like a deck of cards
            cardLayout = new CardLayout();
            cardPanel = new Panel(cardLayout);
            
            // Create different panels (cards)
            Panel card1 = new Panel();
            card1.setBackground(Color.RED);
            card1.add(new Label("This is Card 1"));
            card1.add(new Button("Button on Card 1"));
            
            Panel card2 = new Panel();
            card2.setBackground(Color.GREEN);
            card2.add(new Label("This is Card 2"));
            card2.add(new TextField("Text field on Card 2", 15));
            
            Panel card3 = new Panel();
            card3.setBackground(Color.BLUE);
            card3.add(new Label("This is Card 3"));
            card3.add(new Checkbox("Checkbox on Card 3"));
            
            Panel card4 = new Panel();
            card4.setBackground(Color.YELLOW);
            card4.add(new Label("This is Card 4 (Last Card)"));
            
            // Add cards to cardPanel
            cardPanel.add(card1, "Card 1");
            cardPanel.add(card2, "Card 2");
            cardPanel.add(card3, "Card 3");
            cardPanel.add(card4, "Card 4");
            
            // Control panel with navigation buttons
            Panel controlPanel = new Panel();
            prevButton = new Button("Previous");
            nextButton = new Button("Next");
            prevButton.addActionListener(this);
            nextButton.addActionListener(this);
            controlPanel.add(prevButton);
            controlPanel.add(nextButton);
            
            add(cardPanel, BorderLayout.CENTER);
            add(controlPanel, BorderLayout.SOUTH);
            
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            });
            
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == nextButton) {
                cardLayout.next(cardPanel);
            } else if (e.getSource() == prevButton) {
                cardLayout.previous(cardPanel);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== AWT Layout Manager Demos ===\n");
        
        System.out.println("1. FlowLayout: Arranges components left to right, wraps to next row");
        new FlowLayoutDemo();
        
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        
        System.out.println("2. BorderLayout: Divides into 5 regions (North, South, East, West, Center)");
        new BorderLayoutDemo();
        
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        
        System.out.println("3. GridLayout: Arranges components in a grid of rows and columns");
        new GridLayoutDemo();
        
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        
        System.out.println("4. CardLayout: Shows one component at a time (like slides)");
        new CardLayoutDemo();
        
        System.out.println("\nAll demos launched! Close each window individually.");
    }
}
