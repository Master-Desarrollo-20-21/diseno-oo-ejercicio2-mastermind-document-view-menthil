package es.escuelaIt.masterProgramacion.doo;

public class Game {

    public static final int COMBINATION_SIZE = 4;
	private Turn turn;
    private Player player[];
    private Board board;

    public Game() {
        this.turn = new Turn();
        this.player = new Player[2];
        this.player[0] = new MakerPlayer();
        this.player[1] = new BreakerPlayer();
        this.board = new Board();
    }

	public int getAttempts() {
		return 0;
	}

	public Error checkCombination(String combinationString) {
		return Error.NULL;
	}

	public void addProposedCombination(String combinationString) {
	}
}
