package exercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int deadLine, proximaLinha, opcao, espaco;
		int mat[][] = new int[20][20];
		
		Scanner leitura = new Scanner(System.in);
		Random gerador = new Random();
		
		for(int linha = 0; linha < mat.length; linha++) {
			for(int coluna = 0; coluna < mat[linha].length; coluna++) {
				mat[linha][coluna] = gerador.nextInt(9);
				}
			}
		
		while(true) {
			
			System.out.println("Escolha uma das op��es");
			System.out.println("1) Matriz Completa\n2) Tri�ngulo superiror a partir da esquerda\n"
					+ "3) Triangulo superior a partir da direita\n4) Tri�ngulo inferior a partir da esquerda\n"
					+ "5) Tri�ngulo inferior a partir da direita\n6) Sair");
			opcao = Integer.parseInt(leitura.nextLine());
			
			switch(opcao) {
			
				case 1:
					
					deadLine = 20;
					proximaLinha = 0;
					
					for(int linha = 0; linha < mat.length; linha++) {
						for(int coluna = 0; coluna < mat[linha].length; coluna++) {
							System.out.print(mat[linha][coluna] + " ");
							proximaLinha++;
							if(proximaLinha == deadLine) {
								proximaLinha = 0;
								System.out.println();
							}
							}
						}
					break;
				case 2:
					
					deadLine = 20;
					proximaLinha = 0;
					
					for(int linha = 0; linha < mat.length; linha++) {
						for(int coluna = 0; coluna < mat[linha].length; coluna++) {
							System.out.print(mat[linha][coluna] + " ");
							proximaLinha++;
							if(proximaLinha == deadLine) {
								deadLine--;
								proximaLinha = 0;
								System.out.println();
								break;
							}
							}
						}
					break;
				case 3:
					
					deadLine = 0;
					proximaLinha = 0;
					espaco = 0;
					
					for(int linha = 0; linha < mat.length; linha++) {
						for(int coluna = 0; coluna < mat[linha].length; coluna++) {
							if(deadLine == espaco) {
								System.out.print(mat[linha][coluna] + " ");
								proximaLinha++;
							}
							if(espaco < deadLine) {
								System.out.print("  ");
								espaco++;
								proximaLinha++;
							}
							if(proximaLinha == 20) System.out.println();
						}
						deadLine++;
						proximaLinha = 0;
						espaco = 0;
					}
					break;
				case 4:
					
					deadLine = 1;
					proximaLinha = 0;
					
					for(int linha = 0; linha < mat.length; linha++) {
						for(int coluna = 0; coluna < mat[linha].length; coluna++) {
							System.out.print(mat[linha][coluna] + " ");
							proximaLinha++;
							if(proximaLinha == deadLine) {
								System.out.println();
								deadLine++;
								proximaLinha = 0;
								break;
							}
							}
						}
					break;
				case 5:
					
					deadLine = 0;
					proximaLinha = 0;
					espaco = 19;
					
					for(int linha = 0; linha < mat.length; linha++) {
						for(int coluna = 0; coluna < mat[linha].length; coluna++) {
							if(deadLine == espaco) {
								System.out.print(mat[linha][coluna] + " ");
								proximaLinha++;
							}
							if(espaco > deadLine) {
								System.out.print("  ");
								espaco--;
								proximaLinha++;
							}
							if(proximaLinha == 20) System.out.println();
						}
						deadLine++;
						proximaLinha = 0;
						espaco = 19;
					}
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("A op��o informada � inv�lida!");
			}	
			
		}
		
	}
}

