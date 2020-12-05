package es.escuelaIt.masterProgramacion.doo;

import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class StartView {

    private GameView gameView;

    public StartView(Game game) {
        this.gameView = new GameView(game);
    }

    public void interact() {
        Console console = Console.getInstance();
        console.writeln("-----------------MASTERMIND-----------------");
        this.gameView.write();
    }

}