import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;

import style.RoundButton;

public class Home extends BasicButtonUI {

    private JFrame frame;
    private JPanel panel;
    private JButton buttonReserve, buttonReport, buttonLogout;
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
        panel.setLayout(null);
        frame.add(panel);

        mainTitle = new JLabel("Sport Centre Management System", JLabel.CENTER);
        mainTitle.setFont(new Font("Serif", Font.BOLD, 25));
        mainTitle.setBounds(0, -300, 900, 800);
        mainTitle.setHorizontalAlignment(JLabel.CENTER);
        mainTitle.setVerticalAlignment(JLabel.CENTER);
        panel.add(mainTitle);

        JLabel reserveCourt = new JLabel("Reserve Court", JLabel.CENTER);
        // button = new JButton("Click Me");
        buttonReserve = new JButton("Reserve Court");
        buttonReserve.setBounds(100, 400, 300, 100);
        // create rounded border button
        Border empty = BorderFactory.createEmptyBorder();
        Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compound = BorderFactory.createCompoundBorder(empty, margin);
        buttonReserve.setBorder(compound);
        // button.setUI(new Home());
        // add BLUE as color for button and low the opacity
        // button.setBorder(new RoundButton(50));
        buttonReserve.setBackground(new Color(0, 0, 255, 100));
        // button.setColor(new Color(255, 255, 255, 80));
        // button.setBackground(new Color(0, 0, 255, 100));
        panel.add(buttonReserve);

        buttonReport = new JButton("Graph");
        buttonReport.setBounds(500, 400, 300, 100);
        buttonReport.setBorder(compound);
        buttonReport.setBackground(new Color(0, 0, 255, 100));
        panel.add(buttonReport);

        buttonLogout = new JButton("Logout");
        buttonLogout.setBounds(300, 600, 300, 100);
        buttonLogout.setBorder(compound);
        buttonLogout.setBackground(new Color(0, 0, 255, 100));
        panel.add(buttonLogout);
    }

    public static void main(String[] args) {
        new Home();
    }
}
