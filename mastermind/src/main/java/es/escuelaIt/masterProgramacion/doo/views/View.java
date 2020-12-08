package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;

public class View {

    private Game game;
    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public View(Game game) {
        this.game = game;
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    public void interact() {
        do {
            this.startView.interact();
            do {
                this.proposalView.interact();
            } while (!this.proposalView.isFinished());
        } while (this.resumeView.isResumed());
    }

}
