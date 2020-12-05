package es.escuelaIt.masterProgramacion.doo;

import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class SecretCombinationView {

    private Game game;

	public SecretCombinationView(Game game) {
        this.game = game;
	}

	public void write() {
        Console console = Console.getInstance();
        for (int i = 0; i < Game.COMBINATION_SIZE; i++) {
            console.write("x");
        }
        console.writeln();
	}

}
