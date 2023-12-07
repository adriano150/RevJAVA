package variaveis;

public class SpeedConverter {

	double quilometrosPorHora;
	String resposta;

	public SpeedConverter(double quilometrosPorHora, String resposta) {
		this.quilometrosPorHora = quilometrosPorHora = 0.0;
		this.resposta = "";
	}

	public double getQuilometrosPorHora() {
		return quilometrosPorHora;
	}

	public void setQuilometrosPorHora(double quilometrosPorHora) {
		this.quilometrosPorHora = quilometrosPorHora;
	}
	
	public String getResposta() {
		return resposta;
	}
	
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	//----------
	
	public void toMilhasPorHora(double quilometros) {
		double kmMilhas = quilometros < 0 ? -1 : quilometros * 0.62137;
		setQuilometrosPorHora(Math.round(kmMilhas));
	}
	
	public void printConversion(double quilometros) {
		toMilhasPorHora(quilometrosPorHora);
		String resposta = quilometros < 0 ? "Valor inválido" : quilometros + " KM/H = " + getQuilometrosPorHora() + " MI/H";
		setResposta(resposta);
	}
	
	public String toString() {
		return getResposta();
	}

}
