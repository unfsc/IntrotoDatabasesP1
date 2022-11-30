import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Main {
    static JFrame frame = new JFrame("Frontend GUI");
    private static void initGui() {
        // JFrame frame = new JFrame("Frontend GUI");
        int width = 800;
        int height = 600;
        frame.pack();

        createOptionPanel(frame, width, height);
        // createMainPanel(frame, width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    private static void createOptionPanel(JFrame frame, int width, int height) {
        JPanel optionPanel = new JPanel();
        optionPanel.setLayout(new GridLayout(3, 2));

        JButton button1 = new JButton("Add a new entity to the database ");
        JButton button2 = new JButton("Add a student to specified course or section");
        JButton button3 = new JButton("Calculate a student's GPA");
        JButton button4 = new JButton("Search for courses offered by a department");
        JButton button5 = new JButton("List all course sections previously taught by an instructor");
        JButton button6 = new JButton("Add/update a grade for a student in a course");

        optionPanel.add(button1);
        optionPanel.add(button2);
        optionPanel.add(button3);
        optionPanel.add(button4);
        optionPanel.add(button5);
        optionPanel.add(button6);

        frame.add(optionPanel);

        frame.setSize(width, height);
        // frame.setLocationRelativeTo(null);
        // frame.setVisible(true);
        // frame.setResizable(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(new FlowLayout());
    }

    private static void createMainPanel(JFrame frame, int width, int height) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 1));

        frame.add(mainPanel);
    }

    public static void main(String[] args) {
        initGui();

    }
}