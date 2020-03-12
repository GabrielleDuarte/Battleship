package Entity;

public class Tabuleiro {

	private boolean m[][] = new boolean[10][10];
	// deveria fazer essa alocação no construtor???

	public boolean[][] getM() {
		return m;
	}

	public void setM(boolean[][] m) {
		this.m = m;
	}

	public void zerar() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				m[i][j] = false;
			}
		}
	}
	
	

}
