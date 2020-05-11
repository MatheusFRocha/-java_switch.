import java.util.Scanner;

public class Resposta2 {

	public static void main(String[] args) {
	
		Scanner leitor= new Scanner(System.in);
		
		int cod,qdt;
		double valor_lanche =0;
		
		System.out.println("Olá Caro Cliente!");
		System.out.println();
		System.out.println("LANCHES-------------CÓDIGO--------PREÇO");
		System.out.println("Cachorro quente------100---------R$3,20");
		System.out.println("Bauru Simples--------101---------R$4,30");
		System.out.println("Bauru c/ ovo---------102---------R$5,50");
		System.out.println("Hambúrguer-----------103---------R$3,20");
		System.out.println("Cheeseburguer--------104---------R$4,30");
		System.out.println("Refrigerante---------105----------R$4,00");
		System.out.println();
		
		
		System.out.println("Digite qual lanche gostaria de comer de 100 à 105:");
		cod= leitor.nextInt();
		System.out.println();
		
		System.out.println("Escolha a quantidade:");
		qdt= leitor.nextInt();
		
		
		
		switch(cod) {
		
		case 100:
			System.out.println("Cachorro quente");
			valor_lanche= qdt*3.20;
			break;
		case 101:
			System.out.println("Bauru simples");
			valor_lanche= qdt*4.3;
			break;
		case 102:
			System.out.println("Bauru c/ ovo");
			valor_lanche= qdt*5.5;
			break;
		case 103:
			System.out.println("Hambúguer");
			valor_lanche= qdt*3.2;
			break;
		case 104:
			System.out.println("Cheeseburguer");
			valor_lanche= qdt*4.3;
			break;
		case 105:
			System.out.println("Refrigerante");
			valor_lanche= qdt*4;
			break;
		
	}
		
		System.out.println("Valor da compra é: "+valor_lanche);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
