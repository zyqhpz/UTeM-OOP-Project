package court;

import java.awt.Color;

public class BasketballCourt extends CourtsSelection {
	private String[] btnLabels = { "B1", "B2" };
	private Color colour = new Color(62, 180, 137);

	public BasketballCourt() {
		super.init(80, 80, 80, 80, 1, 2, 40, 40, btnLabels, "BasketballCourt", colour);
	}

	public static void main(String[] args) {
		new BasketballCourt();
	}
}
