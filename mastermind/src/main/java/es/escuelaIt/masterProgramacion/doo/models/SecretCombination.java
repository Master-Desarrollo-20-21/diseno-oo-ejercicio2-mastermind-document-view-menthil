package es.escuelaIt.masterProgramacion.doo.models;

import java.util.Collections;
import java.util.Random;

public class SecretCombination extends Combination {

	public SecretCombination() {
		for (Color color : Color.values()) {
            if (!color.isNull()) this.colors.add(color);
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < (Color.length() - 1) - Combination.COMBINATION_SIZE; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);
	}

	public Result getResult(ProposedCombination proposedCombination) {
		return new Result();
	}

}
