package es.escuelaIt.masterProgramacion.doo;

import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class GameView {

    private Game game;
    private SecretCombinationView secretCombinationView;

    public GameView(Game game) {
        this.game = game;
        this.secretCombinationView = new SecretCombinationView(game);
    }

    public void write() {
        Console console = Console.getInstance();
        int attempts = this.game.getAttempts();
        console.writeln(attempts + " attempt(s):");
        this.secretCombinationView.write();
    }

}
