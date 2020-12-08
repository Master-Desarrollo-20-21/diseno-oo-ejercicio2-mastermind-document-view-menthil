package es.escuelaIt.masterProgramacion.doo.models;

import java.util.List;

public class Combination {
    
    private static final int COMBINATION_SIZE = 4;
    protected List<Color> colors;

    public static int getSize() {
        return Combination.COMBINATION_SIZE;
    }
}
