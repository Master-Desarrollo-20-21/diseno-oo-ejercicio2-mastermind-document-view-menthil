package es.escuelaIt.masterProgramacion.doo;

public class View {

    private Game game;
    private StartView startView;
    private ProposeView proposeView;
    private ResumeView resumeView;

	public View(Game game) {
        this.game = game;
        this.startView = new StartView(this.game);
        this.proposeView = new ProposeView(this.game);
        this.resumeView = new ResumeView(this.game);
	}

	public void interact() {
        this.startView.interact();
        do {
            this.proposeView.interact();
        } while (this.resumeView.interact());
	}

}
