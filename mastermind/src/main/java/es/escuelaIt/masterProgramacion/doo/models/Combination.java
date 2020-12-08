package es.escuelaIt.masterProgramacion.doo.models;

public class Combination {
    
    public static final int COMBINATION_SIZE = 4;
	protected Color colors[];
	protected int elements;

	protected Combination() {
		this.clear();
	}
	
	protected void clear() {
		this.colors = new Color[Combination.COMBINATION_SIZE];
		this.elements = 0;
	}
}
