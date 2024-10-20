package ProjetoDePesquisa;

import java.util.ArrayList;

public class Equipe {
	public ArrayList<Aluno> alunos;
	public ArrayList<Professor> professores;

	public Equipe() {
		this.alunos = new ArrayList<Aluno>();
		this.professores = new ArrayList<Professor>();
	}

	public void addAluno(String nome, String matricula, String tipo) {
		Aluno novoAluno = new Aluno(nome, matricula, tipo);
		alunos.add(novoAluno);
	}

	public void addAluno(Aluno novoAluno) {
		alunos.add(novoAluno);
	}
	
	public void addProfessor(String nome, double salario, String ocupacao, String tipo) {
		Professor novoProfessor = new Professor(nome, salario, ocupacao, tipo);
		professores.add(novoProfessor);
	}
	
	public void addProfessor(Professor novoProfessor) {
		professores.add(novoProfessor);
	}
	
	public String getAlunos(){
		String informacao = "Alunos: \n";
		for(Aluno aluno: alunos) {
			informacao = informacao + aluno.toString() +"\n";
		}
		return informacao;
	}
	
	public String getProfessores() {
		String informacao ="Professores: \n";
		for(Professor professor: professores) {
			informacao = informacao + professor.toString() + "\n \n";
		}
		return informacao;
	}
}
