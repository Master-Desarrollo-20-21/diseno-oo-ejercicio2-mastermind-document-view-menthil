package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Color;

public class ColorView {

    private static final char INITIALS[] = {'r', 'b', 'y', 'g', 'o', 'p'};

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
}
