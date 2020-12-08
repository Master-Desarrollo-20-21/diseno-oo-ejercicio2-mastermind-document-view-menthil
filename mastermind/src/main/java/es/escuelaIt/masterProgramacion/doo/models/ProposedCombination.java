package es.escuelaIt.masterProgramacion.doo.models;

import java.util.List;

public class ProposedCombination extends Combination {

	public void clear() {
		super.clear();
	}

	public boolean contains(Color color) {
		assert !color.isNull();
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public void add(Color color) {
		assert this.colors.size() < Combination.COMBINATION_SIZE;
		assert !color.isNull();
		this.colors.add(color);
	}

	public List<Color> getColors() {
		return this.colors;
	}
}
