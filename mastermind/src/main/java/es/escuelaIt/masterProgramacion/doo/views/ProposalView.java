package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Game;
import es.escuelaIt.masterProgramacion.doo.models.ProposedCombination;

public class ProposalView {

	private Game game;

	public ProposalView(Game game) {
		this.game = game;
	}

	public void interact() {
        new GameView(this.game).write();
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.game.addProposedCombination(proposedCombination);
	}

	public boolean isFinished() {
		return this.game.isFinished();
	}
}
