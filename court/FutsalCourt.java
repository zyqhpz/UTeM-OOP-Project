package court;

import java.awt.Color;

public class FutsalCourt extends CourtsSelection {
	private String[] btnLabel = { "F1", "F2", "F3" };
	private String[][] btnLabels = { { "F1", "0" }, { "F2", "1" }, { "F3", "0" } };
	private Color colour = new Color(62, 180, 137);

	public FutsalCourt() {
		// super.init(80, 80, 80, 80, 1, 3, 45, 45, btnLabels, "Futsal Court", colour);
		super.court(80, 80, 80, 80, 1, 3, 45, 45, btnLabels, "Futsal Court", colour);
	}

	public static void main(String[] args) {
		new FutsalCourt();
	}
}