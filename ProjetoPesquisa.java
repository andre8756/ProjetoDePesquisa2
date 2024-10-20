package ProjetoDePesquisa;

//import java.util.ArrayList;

public class ProjetoPesquisa {
	private int codigo;
	private String titulo;
	private String dataInicio;
	private String dataFinal;
	private Professores professores;
	private Alunos alunos;
	private Equipe equipe;
	//private ArrayList<Funcionario> professores = new ArrayList<>();
	//private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();
	
	
	
	public Alunos getAlunos() {
		return alunos;
	}
	
	public ProjetoPesquisa(int codigo, String titulo, 
			String dataInicio, String dataFinal) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.professores = new Professores();
		this.alunos = new Alunos();
		this.equipe = new Equipe();
	}

	public Professores getProfessores() {
		return professores;
	}
	
	public Equipe getEquipes() {
		return equipe;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	@Override
	public String toString() {
		String informacaoAlunos = "Alunos: \n";
		for(Aluno aluno : getEquipes().alunos) {
			informacaoAlunos = informacaoAlunos + aluno.toString() + "\n ";
		}
		
		String informacaoProfessores = "Professores: \n";
		for(Professor professor: getEquipes().professores) {
			informacaoProfessores = informacaoProfessores + professor.toString()
			+ "\n";
		}
		
		return "Dados da equipe: \n Codigo: "+ getCodigo() + "\n Titulo: "
		+getTitulo()+"\n Data de Inicio: "+getDataInicio()+"\n Data de Termino: "
		+getDataFinal()+"\n"+"\n" + informacaoAlunos +"\n"+informacaoProfessores;
	}
	
	
	
	
}
