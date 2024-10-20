package ProjetoDePesquisa;

public class Main {
	public static void main(String[] args) {
		ProjetoPesquisa projeto = new ProjetoPesquisa(123, "Pesquisa 1", "20/10/2024", "30/05/2025");
		//Professores professores = new Professores();
		Alunos alunos = new Alunos();
		Equipe equipeA = new Equipe();
		
		//------------------------------------
		// Cadastrando professores
		Professor professorA = new Professor("Andre", 1700, "Biologia", "Professor");
		Professor professorB = new Professor("Luiz", 2400, "Informatica", "Professor");
		
		projeto.getProfessores().addProfessor(professorA);
		projeto.getProfessores().addProfessor(professorB);
		
		//Lista de professores cadastrados
		//System.out.println(projeto.getProfessores().toString()); 
		
		//------------------------------------
		//Cadastrando Alunos
		Aluno alunoA = new Aluno("Roberto", "154", "Aluno");
		Aluno alunoB = new Aluno("Carlos", "654", "Aluno");
		
		alunos.addAluno(alunoA);
		alunos.addAluno(alunoB);
		
		//Lista de Alunos
		//System.out.println(alunos.toString());
		
		//------------------------------------
		// Cadastrando Equipe
		equipeA.addAluno(alunoA);
		equipeA.addAluno(alunoB);
		//System.out.println(equipeA.getAlunos());
		
		equipeA.addProfessor(professorA);
		equipeA.addProfessor(professorB);
		//System.out.println(equipeA.getProfessores());
		
		//---------------------------------------
		//Cadastrando um projeto
		ProjetoPesquisa projetoA = new ProjetoPesquisa(123, "Pesquisa 1", "20/10/2024", "30/05/2025");
		//projetoA.getAlunos().addAluno(alunoA);
		//projetoA.getAlunos().addAluno(alunoB);
		//projetoA.getProfessores().addProfessor(professorA);
		//projetoA.getProfessores().addProfessor(professorB);
		
		projetoA.getEquipes().addAluno(alunoA);
		projetoA.getEquipes().addAluno(alunoB);
		projetoA.getEquipes().addProfessor(professorA);
		projetoA.getEquipes().addProfessor(professorB);
		
		
		System.out.println(projetoA.toString());
		
	}
}
