package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Color;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class ColorView {

    private static final char INITIALS[] = {'r', 'b', 'y', 'g', 'o', 'p'};
    private Color color;

	public ColorView(Color color) {
        this.color = color;
	}

	public static Color getColor(char character) {
        for (int i = 0; i < ColorView.INITIALS.length; i++) {
            if (ColorView.INITIALS[i] == character) {
                return Color.values()[i];
            }
        }
		return Color.NULL;
	}

	public static String getValidColors() {
        String validColors = "";
        for (int i = 0; i < ColorView.INITIALS.length; i++) {
            validColors += ColorView.INITIALS[i];
        }
		return validColors;
	}

	public void write() {
        Console.getInstance().write(ColorView.INITIALS[this.color.ordinal()]);
	}
}
