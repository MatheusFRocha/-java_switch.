import java.util.Scanner;

public class Resposta4 {

	public static void main(String[] args) {
		
	Scanner leitor= new Scanner(System.in);
	
	int notas;
	int n1,n2,n3;
	int aritimetico;
	int ponderado;
	
	System.out.println("Calcule o valor das suas 3 notas inteiras de 2 formas diferentes: 1-média aritimética ou 2-média ponderada");
	System.out.println();
	System.out.println("Digite qual forma será utilizada");
	notas= leitor.nextInt();
	
	switch(notas) {
	
	case 1:
	System.out.println("Informe suas notas");
	n1= leitor.nextInt();
	System.out.println();
	n2= leitor.nextInt();
	System.out.println();
	n3= leitor.nextInt();
	
	aritimetico = n1+n2+n3/3;
	System.out.println();
	System.out.println("Sua média é: "+aritimetico);
	
	case 2:
		System.out.println("Os pesos são 3,3 e 4");
		System.out.println("Informe suas notas");
		n1= leitor.nextInt();
		System.out.println();
		n2= leitor.nextInt();
		System.out.println();
		n3= leitor.nextInt();
		
		ponderado= (n1*3)+(n2*3)+(n3*4)/(3*3*4);
		
		System.out.println();
		System.out.println("Sua média é: "+ponderado);
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
