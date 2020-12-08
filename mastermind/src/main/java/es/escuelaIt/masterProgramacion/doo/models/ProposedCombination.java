package es.escuelaIt.masterProgramacion.doo.models;

import java.util.ArrayList;
import java.util.List;

public class ProposedCombination extends Combination {

    public ProposedCombination() {
        this.reset();
    }
    
    public void reset() {
        this.colors = new ArrayList<>();
    }

    public boolean contains(Color color) {
        assert !color.isNull();
        for (int i = 0; i < this.colors.size(); i++) {
            if (this.colors.get(i) == color) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Color color, int position) {
        assert position < this.colors.size();
        return color == this.colors.get(position);
    }

    public void add(Color color) {
        assert this.colors.size() < Combination.COMBINATION_SIZE;
        assert !color.isNull();
        this.colors.add(color);
    }

    public List<Color> getColors() {
        return this.colors;
    }
}
