import java.util.Scanner;

public class Resposta6 {

	public static void main(String[] args) {
		
		
		Scanner leitor= new Scanner(System.in);
		
		int opcao;
		float salario, diferenca, salarioporcento, salariototal;
		
	
		System.out.println();
		System.out.println("----------------FUNÇÕES-------------");
		System.out.println("Diretor--------------------------001");
		System.out.println("Engenheiro-----------------------002");
		System.out.println("Técnico------------------------- 003");
		System.out.println("Gerente------------------------- 004");
		System.out.println("Analista------------------------ 005");
		System.out.println("Coordenador--------------------- 006");
		System.out.println();
		System.out.println("Se sua função não está aqui,você receberá 40% de aumento");
		System.out.println();
		System.out.println("Digite qual sua função para exibir seu aumento: ");
		opcao= leitor.nextInt();
		System.out.println();
		System.out.println("Digite seu salário");
		salario= leitor.nextInt();
		
		
		switch (opcao) {
		case 1:
			salarioporcento= salario * 10 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Diretor"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
		case 2:
			salarioporcento= salario * 20 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Engenheiro"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
		case 3:
			salarioporcento= salario * 30 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Tecnico"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
		case 4:
			salarioporcento= salario * 10 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Gerente"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
		case 5:
			salarioporcento= salario * 30 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Analista"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
		case 6:
			salarioporcento= salario * 20 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Coordenador"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
			
		case 7:
			salarioporcento= salario * 40 / 100; 
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			System.out.printf("Cargo: Outros"
					+ "\nSalario antigo: "+salario+" Reais."
					+ "\nNovo salario: "+salariototal+" Reais"
					+"\nDiferenca: "+diferenca+" Reais.");
			break;
			
			
		default:
			System.out.println("Erro, tente novamente.");
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
