package exercicio2;

import java.util.Scanner;

public class Calculadora {
	
public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int numUm = 0, numDois = 0, opcao, soma, multiplica, dividi, subtrai;
		OperacoesMatematicas calculadora = new OperacoesMatematicas();
		
		while(true) {
			
			System.out.println("Calculadora");
			do {
				System.out.println("Escolha uma das opera��es abaixo:");
				System.out.println("1) Somar\n2) Subtrair\n3) Multiplicar\n4) Dividir\n5) Sair");
				opcao = Integer.parseInt(leitura.next());
			}while(opcao < 1 || opcao > 6);
			
			if(opcao != 5) {
				do {
					System.out.print("Informe o primeiro n�mero: ");
					numUm = Integer.parseInt(leitura.next());
					System.out.print("Informe o segundo n�mero: ");
					numDois = Integer.parseInt(leitura.next());
				}while(opcao == 4 && numDois == 0);
			}
			
			switch(opcao) {
			
				case 1:
					soma = calculadora.somar(numUm, numDois);
					System.out.println("A soma dos n�meros " + numUm + " e " + numDois + " � " + soma);
					break;
				case 2:
					subtrai =calculadora.subtrair(numUm, numDois);
					System.out.println("A subtra��o dos n�meros " + numUm + " e " + numDois + " � " + subtrai);
					break;
				case 3:
					multiplica = calculadora.multiplicar(numUm, numDois);
					System.out.println("A multiplica��o dos n�meros " + numUm + " e " + numDois + " � " + multiplica);
					break;
				case 4:
					dividi = calculadora.dividir(numUm, numDois);
					System.out.println("A divis�o dos n�meros " + numUm + " e " + numDois + " � " + dividi);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Op��o informava inv�lida!");
					break;
			}
			
		}
		
	}

}
