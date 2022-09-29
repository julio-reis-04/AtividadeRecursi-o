package Atividade1;

public class SomaFatores {
	private int n;

	public SomaFatores(int n) {
		this.n = n;
	}
	
	

	public SomaFatores() {
	}



	public void setN(int n) {
		this.n = n;
	}
	
	
	public int SomaNElementos(int n) {
		if (n==1) {
			return 1;
		}else {
			return n+SomaNElementos(n-1);
		}
	}
	
	
	

}
