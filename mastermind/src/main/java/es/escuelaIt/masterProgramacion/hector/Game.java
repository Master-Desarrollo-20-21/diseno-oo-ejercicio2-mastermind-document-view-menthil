package es.escuelaIt.masterProgramacion.hector;

public class Game {

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
}
