package cal;
import java.util.Scanner;
public class main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		int valor1 = 0;

		
		System.out.println("Escreva seu primeiro valor");
			valor = sc.nextInt();
		System.out.println("Escreva seu segundo Valor");
			valor1 = sc.nextInt();
		System.out.println("Escolha qual a operação que você deseja usar");
		System.out.println("--------------------");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Mutiplicação");
		System.out.println("4 - Divisão"); 
		System.out.println("--------------------");
			int opcao = sc.nextInt();
			int resultado = 0;
			boolean valido = true;
		switch(opcao) {
		case 1:
			resultado = valor + valor1;
			break;
		case 2:
			resultado = valor - valor1;
			break;
		case 3:
			resultado = valor * valor1;
			break;
		case 4:
			if(valor1 != 0) {
				resultado = valor / valor1;
			}
			else {
				System.out.println("Erro: Divisão por zero!");
				valido = false;
			}
			break;
			default:
				System.out.println("Opção Inválida");
				valido = false;
			}
		if(valido) {
			System.out.println("Resultado: " + resultado);
		}
		sc.close();
		}
}


    
