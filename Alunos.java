package ProjetoDePesquisa;

import java.util.ArrayList;

public class Alunos {
	public ArrayList<Aluno> alunos;
	
	public Alunos() {
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(String nome, String matricula, String tipo) {
		Aluno novoAluno = new Aluno(nome, matricula, tipo);
		alunos.add(novoAluno);
	}
	
	public void addAluno(Aluno novoAluno) {
		alunos.add(novoAluno);
	}

	@Override
	public String toString() {
		String informacao = "Alunos: \n";
		for(Aluno aluno: alunos) {
			informacao = informacao + aluno.toString() + "\n";
		}
		return informacao;
	}
	
}
