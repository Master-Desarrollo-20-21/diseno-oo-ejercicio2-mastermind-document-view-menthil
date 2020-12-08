package es.escuelaIt.masterProgramacion.doo.models;

public enum Color {

    RED, BLUE, YELLOW, GREEN, ORANGE, PURPLE, NULL;

	public boolean isNull() {
		return this == Color.NULL;
	}
}
