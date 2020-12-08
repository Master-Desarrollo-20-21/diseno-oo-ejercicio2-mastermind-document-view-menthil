package es.escuelaIt.masterProgramacion.doo.models;

public enum Error {
    WRONG_LENGTH, WRONG_COLORS, DUPLICATE, NULL;

    public boolean isNull() {
        return this == Error.NULL;
    }
}
