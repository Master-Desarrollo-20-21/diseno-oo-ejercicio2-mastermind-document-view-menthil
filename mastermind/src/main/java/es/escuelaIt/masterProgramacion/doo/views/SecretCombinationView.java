package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.SecretCombination;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class SecretCombinationView {

    public void write() {
        Console console = Console.getInstance();
        for (int i = 0; i < SecretCombination.getSize(); i++) {
            console.write(Message.SECRET.getMessage());
        }
        console.writeln();
    }

}
