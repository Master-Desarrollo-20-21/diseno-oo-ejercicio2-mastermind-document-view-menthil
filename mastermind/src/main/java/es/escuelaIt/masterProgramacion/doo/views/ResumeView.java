package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;
import es.escuelaIt.masterProgramacion.doo.utils.YesNoDialog;

public class ResumeView {

    private Game game;

    public ResumeView(Game game) {
        this.game = game;
    }

    public boolean isResumed() {
        new GameView(this.game);
        this.game.reset();
        return new YesNoDialog().read("RESUME");
    }
}
