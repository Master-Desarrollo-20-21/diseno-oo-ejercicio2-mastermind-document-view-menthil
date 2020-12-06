package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class StartView {

    private Game game;

    public StartView(Game game) {
        this.game = game;
    }

    public void interact() {
        Console console = Console.getInstance();
        console.writeln("-----------------MASTERMIND-----------------");
        new GameView(this.game).write();
    }

}
