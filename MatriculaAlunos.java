package trabalhoalunos;

import java.util.Scanner;

public class MatriculaAlunos {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno(); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
		aluno1.nome = sc.next();
		
		aluno1.adicionarDisciplina();
		aluno1.adicionarDisciplina();
		aluno1.adicionarDisciplina();
		aluno1.adicionarDisciplina();
		aluno1.adicionarDisciplina();
		aluno1.adicionarDisciplina();
		aluno1.fazerMatricula();
		aluno1.pagarMatricula();
		
		System.out.print("Informe o nome do aluno: ");
		aluno2.nome = sc.next();
		
		aluno2.removerDisciplina();
		aluno2.adicionarDisciplina();
		aluno2.adicionarDisciplina();
		aluno2.fazerMatricula();
		aluno2.pagarMatricula();
		
		System.out.print("Informe o nome do aluno: ");
		aluno3.nome = sc.next();
		
		aluno3.fazerMatricula(); 
		aluno3.adicionarDisciplina();
		aluno3.adicionarDisciplina();
		aluno3.adicionarDisciplina();
		aluno3.removerDisciplina();
		aluno3.pagarMatricula();
		aluno3.fazerMatricula();
		aluno3.pagarMatricula();
		
	}

}
