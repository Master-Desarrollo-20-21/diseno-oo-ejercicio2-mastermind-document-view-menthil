package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;

public class View {

    private Game game;
    private StartView startView;
    private ProposalView proposeView;
    private ResumeView resumeView;

	public View(Game game) {
        this.game = game;
        this.startView = new StartView(this.game);
        this.proposeView = new ProposalView(this.game);
        this.resumeView = new ResumeView(this.game);
	}

	public void interact() {
        this.startView.interact();
        do {
            this.proposeView.interact();
        } while (this.resumeView.interact());
	}

}
