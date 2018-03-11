package br.com.fatec.AtividadeAvaliacao3ED.exerc3;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {
	/**
	 * Exerc�cio 3 � O trecho de c�digo a seguir se encontra no m�todo add. Por
	 * que ap�s fazer a mudan�a a seguir a lista mant�m apenas o 1� valor
	 * adicionado?
	 * 
	 * R. Pois ele dentro do while ele varrer� toda a lista e o �ltimo valor para o a ser lido � o �ltimo elemento
	 * apontar� para o primeiro
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
