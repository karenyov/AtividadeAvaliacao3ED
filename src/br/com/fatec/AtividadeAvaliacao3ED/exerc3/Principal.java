package br.com.fatec.AtividadeAvaliacao3ED.exerc3;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {
	/**
	 * Exercício 3 – O trecho de código a seguir se encontra no método add. Por
	 * que após fazer a mudança a seguir a lista mantém apenas o 1º valor
	 * adicionado?
	 * 
	 * R. Pois ele dentro do while ele varrerá toda a lista e o último valor para o a ser lido é o último elemento
	 * apontará para o primeiro
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
