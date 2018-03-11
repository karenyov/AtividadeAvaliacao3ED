package br.com.fatec.AtividadeAvaliacao3ED.exerc2;

import br.com.fatec.AtividadeAvaliacao3ED.Lista;
import br.com.fatec.AtividadeAvaliacao3ED.No;

/**
 * @author Karen 11 de mar de 2018
 */
public class Principal {
	/**
	 * Exerc�cio 2 � O trecho de c�digo a seguir se encontra no m�todo add. Por
	 * que o c�digo passa a apresentar erro se mudarmos a compara��o de
	 * igualdade (==) para diferente (!=)?
	 * 
	 * R. Ao tentar adicionar o primeiro No ele entrar� no else e como ainda n�o existe o proximo posi��o (pois � o primeiro)
	 * ele mostrar� erro. 
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
