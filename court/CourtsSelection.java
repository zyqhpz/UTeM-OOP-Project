package court;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CourtsSelection // implements ActionListener
{
	protected JFrame frame;
	private String frameTitle = "Sport Selection";
	protected JPanel panel;
	protected GridLayout gridLayout;
	protected JButton button;
	protected boolean status;
	private Color colour = new Color(248, 152, 128);
	private String[] btnLabels = { "Badminton", "Basketball", "Futsal" };
	private int top = 325;
	private int left = 80;
	private int bottom = 325;
	private int right = 80;
	private int row = 1;
	private int col = 3;
	private int hgap = 45;
	private int vgap = 45;

	public CourtsSelection() {
		init(top, left, bottom, right, row, col, hgap, vgap, btnLabels, frameTitle,
				colour);
	}

	public void init(int top, int left, int bottom, int right, int row, int col, int hgap, int vgap, String[] btnLabels,
			String frameTitle, Color colour) {
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
		panel.setLayout(new GridLayout(row, col, hgap, vgap));

		for (String btnLabel : btnLabels) {
			button = new JButton(btnLabel);
			if (status == true)
				button.setBackground(Color.RED);
			else
				button.setBackground(colour);

			// button.addActionListener(this);

			panel.add(button);
		}

		frame = new JFrame();
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(900, 800);
		frame.setTitle(frameTitle);
		frame.setVisible(true);
	}

	// private static final List<Color>COLOR_LIST=new
	// ArrayList<Color>(Arrays.asList(new Color[]{Color.RED,Color.GREEN}));
	/*
	 * public void actionPerformed(ActionEvent e) {
	 * 
	 * if(e.getSource()==button)
	 * button.setBackground(Color.RED);
	 * 
	 * 
	 * 
	 * //int index=COLOR_LIST.indexOf(panel.getBackground());
	 * //if(COLOR_LIST.size()-index>1)
	 * // button.setBackground(COLOR_LIST.get(index+1));
	 * //else
	 * // button.setBackground(COLOR_LIST.get(0));
	 * 
	 * }
	 */

	public void court(int top, int left, int bottom, int right, int row, int col, int hgap, int vgap,
			String[][] btnLabels, String frameTitle, Color colour) {

		JPanel panelCourt = new JPanel();
		panelCourt.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
		panelCourt.setLayout(new GridLayout(row, col, hgap, vgap));

		JFrame frameCourt = new JFrame();
		JButton buttonCourt;

		for (int i = 0; i < btnLabels.length; i++) {
			buttonCourt = new JButton(btnLabels[i][0]);
			if (btnLabels[i][1] == "1")
				buttonCourt.setBackground(Color.RED);
			else
				buttonCourt.setBackground(colour);

			// button.addActionListener(this);
			panelCourt.add(buttonCourt);
		}
		frameCourt = new JFrame();
		frameCourt.add(panelCourt, BorderLayout.CENTER);
		frameCourt.setSize(900, 800);
		frameCourt.setTitle(frameTitle);
		frameCourt.setVisible(true);
	}

	public static void main(String[] args) {
		new CourtsSelection();
	}
}