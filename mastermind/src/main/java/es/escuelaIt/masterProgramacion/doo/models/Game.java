package es.escuelaIt.masterProgramacion.doo.models;

public class Game {

    public static final int MAX_ATTEMPTS = 10;
	private SecretCombination secretCombination;
    private ProposedCombination[] proposedCombinations;
    private int attempts;

    public Game() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ProposedCombination[Game.MAX_ATTEMPTS];
        this.attempts = 0;
    }

	public int getAttempts() {
		return this.attempts;
	}

	public Error checkCombination(String combinationString) {
		return Error.NULL;
	}

	public void addProposedCombination(String combinationString) {
        this.proposedCombinations[this.attempts] = new ProposedCombination(combinationString);
        this.attempts++;
	}

	public int getCombinationSize() {
		return this.secretCombination.getLength();
	}
}
