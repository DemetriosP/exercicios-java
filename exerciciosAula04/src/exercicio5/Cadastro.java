package exercicio5;

import java.util.Scanner;

public class Cadastro {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		Pessoa p = new Pessoa();
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o seu CPF: ");
		p.setCpf(leitura.next());
		
		System.out.print("Informe o seu nome: ");
		p.setNome(leitura.next());
		
		System.out.println("Informe a sua data de nascimento");
		System.out.print("Dia: ");
		d.setDia(leitura.next());
		System.out.print("M�s: ");
		d.setMes(leitura.next());
		System.out.print("Ano: ");
		d.setAno(leitura.next());
		
		p.setDataNascimento(d);
		
		System.out.println("\nDados Cadastrados");
		p.getCpf();
		p.getNome();
		p.getDataNascimento();
		System.out.println(Pessoa.totalDePessoas);
	
	}

}
