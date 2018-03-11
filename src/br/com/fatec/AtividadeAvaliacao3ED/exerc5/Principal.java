package br.com.fatec.AtividadeAvaliacao3ED.exerc5;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 5 – Considere que uma lista possui os seguintes elementos nesta
	 * ordem: 5, 9, 11, 4, 2, 3, 8, 1 Ao chamar o método interrupt(4) a lista
	 * passará a ter somente os elementos: 5, 9, 11, 4 O método interrupt
	 * interrompe a lista no elemento que tiver o conteúdo passado como
	 * parâmetro. Programar o corpo do método interrupt na classe Lista
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Lista a = new Lista();
		No no;
		no = new No();
		no.conteudo = 5;
		a.add(no);
		no = new No();
		no.conteudo = 9;
		a.add(no);
		no = new No();
		no.conteudo = 11;
		a.add(no);
		no = new No();
		no.conteudo = 4;
		a.add(no);
		no = new No();
		no.conteudo = 2;
		a.add(no);
		no = new No();
		no.conteudo = 3;
		a.add(no);
		no = new No();
		no.conteudo = 8;
		a.add(no);
		no = new No();
		no.conteudo = 1;
		a.add(no);
		
		a.interrupt(4);

	}
}
