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
        console.writeln(Message.ATTEMPTS.getMessage().replace("#attempts", "" + attempts));
        new SecretCombinationView(this.game).write();
        for (int i = 0; i < attempts; i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            new ResultView(this.game.getResult(i)).write();
        }
        if (this.game.isFinished()) {
            if (this.game.isWinner()) {
                console.writeln(Message.WINNER.getMessage());
            } else {
                console.writeln(Message.LOOSER.getMessage());
            }
        }
    }

}
