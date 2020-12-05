package es.escuelaIt.masterProgramacion.doo;

import es.escuelaIt.masterProgramacion.doo.models.Game;
import es.escuelaIt.masterProgramacion.doo.views.View;

public class Mastermind 
{
    private Game game;
    private View view;

    private Mastermind() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main( String[] args )
    {
        new Mastermind().play();
    }
}
