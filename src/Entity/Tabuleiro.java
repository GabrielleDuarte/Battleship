package Entity;

public class Tabuleiro {

	private boolean m[][] = new boolean[10][10];
	private Jogador j1;
	private Jogador j2;
	

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

	public Jogador getJ1() {
		return j1;
	}

	public void setJ1(Jogador j1) {
		this.j1 = j1;
	}

	public Jogador getJ2() {
		return j2;
	}

	public void setJ2(Jogador j2) {
		this.j2 = j2;
	}
	
	public Jogador sortear(Jogador j1, Jogador j2) {
		
	}
	
	
	
	

}
