package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class GameView {

    private Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void write() {
        Console console = Console.getInstance();
        int attempts = this.game.getAttempts();
        console.writeln(attempts + " attempt(s):");
        new SecretCombinationView(this.game).write();
        for (int i = 0; i < this.game.getAttempts(); i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            console.write(" --> ");
            console.writeln();
        }
    }

}
