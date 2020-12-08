package es.escuelaIt.masterProgramacion.doo.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_ATTEMPTS = 10;
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

    public boolean isFinished() {
        return this.isWinner() || this.getAttempts() == Game.MAX_ATTEMPTS;
    }

    public boolean isWinner() {
        if (this.getAttempts() == 0) {
            return false;
        }
        return this.results.get(this.getAttempts()-1).isWinner();
    }

    public ProposedCombination getProposedCombination(int i) {
        assert i < this.getAttempts();
        return this.proposedCombinations.get(i);
    }

    public Result getResult(int i) {
        assert i < this.getAttempts();
        return this.results.get(i);
    }
}
