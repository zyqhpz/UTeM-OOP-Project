import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

import style.RoundButton;

public class Home extends BasicButtonUI {

    private JFrame frame;
    private JPanel panel, panelBtn;
    private JButton button;
    private String[] buttonLabels = { "Reserve", "Report", "Logout" };
    private JLabel mainTitle;
    // private Font titleFont;

    public Home() {
        init();
        frame.setVisible(true);
    }

    public void init() {
        frame = new JFrame("Home");
        frame.setSize(900, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 10, 10, 10));

        panelBtn = new JPanel();
        panelBtn.setLayout(new GridLayout(3, 1, 60, 60));
        panelBtn.setBackground(Color.WHITE);
        panelBtn.setBorder(BorderFactory.createEmptyBorder(150, 100, 150, 100));

        mainTitle = new JLabel("Sport Centre Management System", JLabel.CENTER);
        mainTitle.setFont(new Font("Serif", Font.BOLD, 35));
        mainTitle.setBounds(0, -300, 900, 800);
        mainTitle.setHorizontalAlignment(JLabel.CENTER);
        mainTitle.setVerticalAlignment(JLabel.CENTER);
        panel.add(mainTitle);

        for (String label : buttonLabels) {
            button = new JButton(label);
            button.setFont(new Font("Sans Serif", Font.BOLD, 20));
            button.setBounds(0, 0, 100, 70);
            button.setBackground(Color.orange);
            button.setForeground(Color.BLACK);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panelBtn.add(button);
        }

        frame.add(panel, BorderLayout.NORTH);
        frame.add(panelBtn, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Home();
    }
}
