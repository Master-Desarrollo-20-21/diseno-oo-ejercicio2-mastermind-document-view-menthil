package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;

public class ResumeView {

	private Game game;

	public ResumeView(Game game) {
		this.game = game;
	}

	public boolean isFinished() {
		return this.game.isFinished();
	}

}
