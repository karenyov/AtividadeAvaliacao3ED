package br.com.fatec.AtividadeAvaliacao3ED.exerc1;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 1 � O que � necess�rio alterar no m�todo print para ele entrar
	 * em loop infinito?
	 * 
	 * R. Remover o c�digo no = no.proximo;
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
