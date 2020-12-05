package es.escuelaIt.masterProgramacion.doo;

import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class ProposeView {

	private Game game;

	public ProposeView(Game game) {
		this.game = game;
	}

	public void interact() {
		Console console = Console.getInstance();
		Error error = Error.NULL;
		String combinationString;
		do {
			console.write("Propose a combination: ");
			combinationString = console.readString();
			error = this.game.checkCombination(combinationString);
			new ErrorView(error).write();
		} while (!error.isNull());
		this.game.addProposedCombination(combinationString);
	}

}
