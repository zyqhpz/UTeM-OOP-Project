package style;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class RoundButton implements Border {

    private int roundness;

    public RoundButton(int roundness) {
        this.roundness = roundness;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        // Graphics2D g2 = (Graphics2D) g;
        g.drawRoundRect(x, y, width - 1, height - 1, roundness, roundness);
        // g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        // RenderingHints.VALUE_ANTIALIAS_ON);
        // g2.fillRoundRect(x, y, width - 1, height - 1, roundness, roundness);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(roundness + 1, roundness + 1, roundness + 2, roundness);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

}
