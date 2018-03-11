package br.com.fatec.AtividadeAvaliacao3ED.exerc1;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 1 – O que é necessário alterar no método print para ele entrar
	 * em loop infinito?
	 * 
	 * R. Remover o código no = no.proximo;
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista a = new Lista();
		No no;
		no = new No();
		no.conteudo = 9;
		a.add(no);
		no = new No();
		no.conteudo = 5;
		a.add(no);
		a.print();
	}

}
