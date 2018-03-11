package br.com.fatec.AtividadeAvaliacao3ED.exerc2;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {
	/**
	 * Exercício 2 – O trecho de código a seguir se encontra no método add. Por
	 * que o código passa a apresentar erro se mudarmos a comparação de
	 * igualdade (==) para diferente (!=)?
	 * 
	 * R. Ao tentar adicionar o primeiro No ele entrará no else e como ainda não existe o proximo posição (pois é o primeiro)
	 * ele mostrará erro. 
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
