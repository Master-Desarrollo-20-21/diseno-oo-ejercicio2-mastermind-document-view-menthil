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
        int blacks = 0;
        int whites = 0;
        for (int i = 0; i < this.colors.size(); i++) {
            Color color = this.colors.get(i);
            if (proposedCombination.contains(color, i)) {
                blacks++;
            } else {
                if (proposedCombination.contains(color)) {
                    whites++;
                }
            }
        }
        return new Result(blacks, whites);
    }

}
