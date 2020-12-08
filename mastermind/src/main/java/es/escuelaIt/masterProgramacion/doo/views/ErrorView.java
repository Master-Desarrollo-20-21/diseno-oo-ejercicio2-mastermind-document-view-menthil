package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Error;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class ErrorView {

    private static final String[] MESSAGES = { 
        "Wrong proposed combination length",
        "Wrong colors, they must be: " + ColorView.getValidColors(),
        "Duplicated color"
    };

    private Error error;

    public ErrorView(Error error) {
        this.error = error;
    }

    public void write() {
        if (!this.error.isNull()) {
            Console console = Console.getInstance();
            console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
        }
    }
}
