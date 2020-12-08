package es.escuelaIt.masterProgramacion.doo.models;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    
    public static final int COMBINATION_SIZE = 4;
    protected List<Color> colors;

    protected Combination() {
        this.clear();
    }
    
    protected void clear() {
        this.colors = new ArrayList<>();
    }
}
