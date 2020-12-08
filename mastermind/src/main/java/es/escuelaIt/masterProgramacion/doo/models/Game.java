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

	public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations[this.attempts] = proposedCombination;
        this.attempts++;
	}

	public int getCombinationSize() {
		return Combination.COMBINATION_SIZE;
	}
}
