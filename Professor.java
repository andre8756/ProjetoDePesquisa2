package ProjetoDePesquisa;

public class Professor extends Funcionario implements Pesquisador {
	private String tipo;
	private String ocupacao;
	
	public Professor(String nome, double salario, String ocupacao, String tipo) {
		super(nome, salario);
		this.ocupacao = ocupacao;
		this.tipo = tipo;
	}

	@Override
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	@Override
	public String toString() {
		return "Nome: "+ super.getNome() +" \n Salario: " + super.getSalario() +
				"\n Ocupacao: " + getOcupacao() + "\n Tipo: " + getTipo();
	}
	
	

}
