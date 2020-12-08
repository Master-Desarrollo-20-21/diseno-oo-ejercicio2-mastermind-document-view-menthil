package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.ProposedCombination;
import es.escuelaIt.masterProgramacion.doo.models.Color;
import es.escuelaIt.masterProgramacion.doo.models.Combination;
import es.escuelaIt.masterProgramacion.doo.models.Error;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class ProposedCombinationView {

    private ProposedCombination proposedCombination;

    public ProposedCombinationView(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public void read() {
        Console console = Console.getInstance();
        Error error;
        String characters;
        do {
            error = Error.NULL;
            console.write("Propose a combination: ");
            characters = console.readString();
            if (characters.length() != Combination.COMBINATION_SIZE) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = ColorView.getColor(characters.charAt(i));
                    if (color.isNull()) {
                        error = Error.WRONG_COLORS;
                    } else {
                        if (this.proposedCombination.contains(color)) {
                            error = Error.DUPLICATE;
                        } else {
                            this.proposedCombination.add(color);
                        }
                    }
                }
            }
            if (!error.isNull()) {
                new ErrorView(error).write();
                this.proposedCombination.clear();
            }
        } while (!error.isNull());
    }

    public void write() {
        for (Color color : this.proposedCombination.getColors()) {
            new ColorView(color).write();
        }
    }
}
