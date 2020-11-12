package exercicio6;

import java.util.Scanner;

public class Restaurante {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int codigo;
		String opcao;
		
		Cardapio c = new Cardapio();
		ItemDoCardapio item1 = new ItemDoCardapio();
		ItemDoCardapio item2 = new ItemDoCardapio();
		ItemDoCardapio item3 = new ItemDoCardapio();
		ItemDoCardapio item4 = new ItemDoCardapio();
		ItemDoCardapio item5 = new ItemDoCardapio();
		
		item1.setNome("Arroz Pilaf");
		item1.setValor(23.95);
		item2.setNome("Mini Burgers");
		item2.setValor(57.50);
		item3.setNome("Steakhous Pasta");
		item3.setValor(55.50);
		item4.setNome("Tilapia Filet");
		item4.setValor(56.50);
		item5.setNome("Caesar Salad");
		item5.setValor(23.95);
		
		c.setItens(item1);
		c.setItens(item2);
		c.setItens(item3);
		c.setItens(item4);
		c.setItens(item5);
		
		PedidoDoCliente cliente = new PedidoDoCliente();
		
		c.exibirCardapio();
		
		do {
			do {
				System.out.print("\nInforme o c�digo do prato desejado: ");
				codigo = Integer.parseInt(leitura.next());
			}while(codigo < 1 || codigo > 5);
			
			cliente.registraPedido(c.getItensNome(codigo - 1), c.getItensValor(codigo - 1));

			System.out.println("Deseja escolher outro prato?\nS para sim, N para n�o");
			opcao = leitura.next().toUpperCase();
		}while(opcao.equals("S"));
		
		cliente.exibeConta();
	}

}
