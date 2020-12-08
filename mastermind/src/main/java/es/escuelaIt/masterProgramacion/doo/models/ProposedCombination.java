package es.escuelaIt.masterProgramacion.doo.models;

public class ProposedCombination extends Combination {

	public void clear() {
		super.clear();
	}

	public boolean contains(Color color) {
		assert !color.isNull();
		for (int i = 0; i < this.elements; i++) {
			if (this.colors[i] == color) {
				return true;
			}
		}
		return false;
	}

	public void add(Color color) {
		assert this.elements < Combination.COMBINATION_SIZE;
		assert !color.isNull();
		this.colors[this.elements] = color;
		this.elements++;
	}
}
