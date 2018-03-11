package br.com.fatec.AtividadeAvaliacao3ED.exerc4;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 4 – Completar o código a seguir para unir as duas listas, ou
	 * seja, encadear uma lista na outra. Observação: não é permitido alterar o
	 * código da classe Lista.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista a = new Lista(), b = new Lista();
		No no;
		no = new No();
		no.conteudo = 9;
		a.add(no);
		no = new No();
		no.conteudo = 5;
		a.add(no);
		no = new No();
		no.conteudo = 2;
		a.add(no);
		no = new No();
		no.conteudo = 4;
		a.add(no);
		no = new No();
		no.conteudo = 5;
		a.add(no);

		no = new No();
		no.conteudo = 20;
		b.add(no);
		no = new No();
		no.conteudo = 10;
		b.add(no);
		no = new No();
		no.conteudo = 15;
		b.add(no);
		// código para unir as duas listas

		No temp = a.inicio;
		while (temp.proximo != null) {
			temp = temp.proximo;
		}
		temp.proximo = b.inicio;		
		a.print();

	}

}
