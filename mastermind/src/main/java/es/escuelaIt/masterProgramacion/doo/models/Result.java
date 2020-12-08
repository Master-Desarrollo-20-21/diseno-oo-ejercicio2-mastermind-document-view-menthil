package es.escuelaIt.masterProgramacion.doo.models;

public class Result {

    private int blacks;
    private int whites;

    public Result(int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
    }

    public int getBlacks() {
        return this.blacks;
    }

    public int getWhites() {
        return this.whites;
    }

    public boolean isWinner() {
        return this.getBlacks() == ProposedCombination.getSize();
    }

}
