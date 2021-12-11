package court;

import java.awt.Color;

public class BadmintonCourt extends CourtsSelection {
	private String[] btnLabels = { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13",
			"A14", "A15", "A16", "A17", "A18", "A19", "A20" };
	private Color colour = new Color(62, 180, 137);

	public BadmintonCourt() {
		super.init(40, 40, 40, 40, 5, 4, 15, 25, btnLabels, "Badminton Court", colour);
	}

	public static void main(String[] args) {
		new BadmintonCourt();
	}
}