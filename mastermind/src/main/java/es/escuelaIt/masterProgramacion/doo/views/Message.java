package es.escuelaIt.masterProgramacion.doo.views;

public enum Message {

    ATTEMPTS("#attempts attempt(s): "),
    WINNER("You've won!! ;-)"),
    LOOSER("You've lost!! :-("),
    PROPOSE("Propose a combination: "),
    RESULT(" --> #blacks blacks and #whites whites"),
    RESUME("RESUME"),
    SECRET("x"),
    TITLE("-----------------MASTERMIND-----------------");
    
    private final String message;

    private Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
