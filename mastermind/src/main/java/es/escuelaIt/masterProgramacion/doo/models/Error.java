package es.escuelaIt.masterProgramacion.doo.models;

public enum Error {
    WRONG_LENGTH, WRONG_COLORS, NULL;

	public boolean isNull() {
		return this == Error.NULL;
	}
}
