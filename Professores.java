package ProjetoDePesquisa;

import java.util.ArrayList;

public class Professores {
	public ArrayList<Professor> professores;
	
	public Professores(){
		this.professores = new ArrayList<Professor>();
	}
	
	public void addProfessor(String nome, double salario, String ocupacao, String tipo) {
		Professor novoProfessor = new Professor(nome, salario, ocupacao, tipo);
		professores.add(novoProfessor);
	}
	
	public void addProfessor(Professor novoProfessor) {
		professores.add(novoProfessor);
	}
	
	public ArrayList<Professor> getProfessores(){
		return professores;
	}

	@Override
	public String toString() {
		String informacao = "Professores: \n";
		for(Professor professor: professores) {
			informacao = informacao + professor.toString() + "\n \n";
		}
		return informacao;
	}
}
