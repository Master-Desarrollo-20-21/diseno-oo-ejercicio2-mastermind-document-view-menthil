package es.escuelaIt.masterProgramacion.doo.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static final int MAX_ATTEMPTS = 10;
	private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;

    public Game() {
		this.reset();
    }

	public void reset() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.results = new ArrayList<>();
	}

	public int getAttempts() {
		return this.proposedCombinations.size();
	}

	public void addProposedCombination(ProposedCombination proposedCombination) {
        assert this.getAttempts() < Game.MAX_ATTEMPTS;
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
	}

	public int getCombinationSize() {
		return Combination.COMBINATION_SIZE;
	}

	public boolean isFinished() {
		return this.getAttempts() == Game.MAX_ATTEMPTS;
	}

	public ProposedCombination getProposedCombination(int i) {
		assert i < this.getAttempts();
		return this.proposedCombinations.get(i);
	}
}
