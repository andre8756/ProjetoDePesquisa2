package ProjetoDePesquisa;

public class Aluno implements Pesquisador{
	
	private String matricula;
	private String nome;
	private String tipo;
	
	public Aluno(String nome, String matricula, String tipo) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n Matricula: " + getMatricula() + "\n Tipo: "+ getTipo();
	}
	
	
	
}
