package trabalhoalunos;

import java.util.Scanner;

public class Aluno {

	Scanner sc = new Scanner(System.in);
	
	String nome;
	int creditos, bolsa;
	double valor, valorfinal, percentual;
	boolean pagamento = false; 

	
	public void adicionarDisciplina() {
		if(creditos >= 20) {
			System.out.println("O(a) aluno(a) j� atingiu o total de cr�ditos, portanto n�o pode adicionar novas disciplinas.");
		}
		else {
			creditos += 4; 
			System.out.println("Total de cr�ditos selecionados: " + creditos);
		}
	
	}
	
	public void removerDisciplina() {
		if (creditos <= 0) {
			System.out.println("O(a) aluno(a) ainda n�o selecionou nenhuma disciplina!");
		}
		else {
			creditos += -4;
			System.out.println("Total de cr�ditos selecionados: " + creditos);
		}
	}
	
	public void fazerMatricula() {
		
		if(creditos > 0) {
			valor = creditos * 304.30; //Valor total do semestre
			
			do {
				System.out.print("O aluno � bolsista? Digite (1) Sim / (2) N�o:");
				bolsa = sc.nextInt();
				
				switch (bolsa) {
				case 1: {
					System.out.print("Informe o percentual de bolsa do aluno em %: ");
					percentual = sc.nextFloat();
					valorfinal = (valor - (valor * (percentual/100))) / 6; 
					break;
				}
				case 2: {
					valorfinal = valor / 6;
					break;
				}
				default:
					System.out.println("Resposta inv�lida.");
				}
			} while (bolsa != 1 && bolsa != 2);
			
			System.out.printf("Valor final: R$%.2f\n", valorfinal);
			System.out.println("O boleto referente � matr�cula foi enviado para seu e-mail. Favor efetuar o pagamento para concluir o processo.");
			
		}
		else {
			System.out.println("O(a) aluno(a) n�o selecionou nenhuma disciplina. Favor selecionar alguma disciplina antes de efetuar a matr�cula.");
		}
		
	}
	
	public void pagarMatricula() {
		if(valorfinal > 0) {
			if (pagamento) {
				System.out.println("O pagamento j� foi efetuado.");
			}
			else {
				pagamento = true;
				System.out.println("Pagamento efetuado.");
				System.out.println(nome + ", sua matr�cula foi conclu�da com sucesso! Bom semestre!\n");
				
			}
		}
		else {
			System.out.println("O pagamento s� pode ser efetuado ap�s a realiza��o da matr�cula.");
		}
		
	}
	
}

