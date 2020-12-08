package es.escuelaIt.masterProgramacion.doo.views;

import es.escuelaIt.masterProgramacion.doo.models.Result;
import es.escuelaIt.masterProgramacion.doo.utils.Console;

public class ResultView {

    private Result result;

	public ResultView(Result result) {
        this.result = result;
	}

	public void write() {
        Console.getInstance().write(this.result.getBlacks() + " blacks and " + this.result.getWhites() + " whites");
	}

}
