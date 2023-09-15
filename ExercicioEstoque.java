package senaiprojetos;

import javax.swing.JOptionPane;

public class ExercicioEstoque {

	public static void main(String[] args) {

		/*
		 * Você foi contratado para elaborar um sistema de controle de estoque. Esse
		 * sistema deve Ter um menu para listar, atualizar, excluir e sair do programa
		 * Portanto ele deve realizar a inclusão do nome, quantidade e valor dos
		 * produtos Comece escolhendo o tamanho do seu estoque e armazenando esse valor
		 * numa variável. Utilize a Classe Scanner para entrada de dados Utilize arrays
		 * para guardar os valores semelhantes Utilize switchcase para escolher o que
		 * fazer conforme a opção que o cliente escolher
		 */

		int valorUsuario;
		String[] produtos = new String[5];
		int[] valores = new int[5];
		int[] quantidade = new int[5];

		valorUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
				" Digite um número \n 1- Listar \n 2- Atualizar \n 3- Excluir \n 4 - Sair do programa "));

		while (true) {
			switch (valorUsuario) {

			case 1:
				for (int i = 0; i < produtos.length;) {
					produtos[i] = JOptionPane.showInputDialog(null,
							" Digite os produtos que deseja adicionar na lista: ");

					valores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o preço dos produtos : "));

					quantidade[i] = Integer
							.parseInt(JOptionPane.showInputDialog(null, " Digite a quantidade do produto : "));

					if (produtos[i] == null || valores[i] == 0 || quantidade[i] == 0) {
						JOptionPane.showMessageDialog(null,
								" Você deixou o campo para digitação vazio, ou digitou o número 0 ,  ERRO!!");
						break;
					}
					System.out.println(" Item adicionado :  " + produtos[i] + " | Valor : R$  " + Math.round(valores[i])
							+ " | Quantidade do produto : " + quantidade[i] + " |TOTAL = RS$ "
							+ quantidade[i] * valores[i]);
					break;

				}

			case 2:
				for (int i = 0; i < produtos.length;) {

					String resposta;

					resposta = JOptionPane.showInputDialog(null,
							"Deseja atualizar o os produtos  ? \n Digite SIM ou NÃO : ");

					if (resposta == null) {
						JOptionPane.showMessageDialog(null, "Você não preencheu o campo corretamente, ERRO!");
						break;
					} else if (resposta.equalsIgnoreCase("sim")) {

						produtos[i] = JOptionPane.showInputDialog(null,
								" Digite o produto que deseja adicionar na lista: ");

						valores[i] = Integer
								.parseInt(JOptionPane.showInputDialog(null, " Digite o preço do produto : "));

						quantidade[i] = Integer
								.parseInt(JOptionPane.showInputDialog(null, " Digite a quantidade do produto : "));

						System.out.println("Produto inserido no array : " + produtos[i]);
						System.out.println("Valor inserido no array : " + valores[i]);
						System.out.println("Quantidade inserida no array : " + quantidade[i]);

						System.out.println(" Item adicionado :  " + produtos[i] + " | Valor : R$  "
								+ Math.round(valores[i]) + " | Quantidade do produto : " + quantidade[i]
								+ " |TOTAL = RS$ " + quantidade[i] * valores[i]);

					} else {

						break;

					}

				}

			case 3:

				String resposta;
				resposta = JOptionPane.showInputDialog(null,
						"ATENÇÃO! Deseja deletar os itens da lista?? Digite SIM ou NÃO");
				if (resposta.equalsIgnoreCase("não")) {
					break;
				} else if (resposta.equalsIgnoreCase("sim")) {
					for (int i = 0; i < valores.length; i++) {

						System.out.println(valores[i] = 0);
						System.out.println(quantidade[i] = 0);
						System.out.println(produtos[i] = null);

						JOptionPane.showMessageDialog(null, "Itens apagados com sucesso!!");

					}

				}

			default:
				JOptionPane.showMessageDialog(null, "Fim da aplicação!");
				break;
			}
		}

	}

}
