package br.com.fatec.AtividadeAvaliacao3ED;

/**
 * @author Karen 11 de mar de 2018
 */
public class Lista {

	public No inicio;

	public No getInicio() {
		return inicio;
	}

	public void add(No no) {
		if (!exists(no.conteudo)) {
			if (inicio == null) {
				inicio = no;
			} else {
				No aux = inicio;
				while (aux.proximo != null) {
					aux = aux.proximo;
				}
				aux.proximo = no;
			}
		}
	}

	public boolean exists(int nro) {
		No no = inicio;
		while (no != null) {
			if (no.conteudo == nro) {
				return true;
			}
			no = no.proximo;
		}
		return false;
	}

	public void print() {
		No no = inicio;
		int cont = 0;
		while (no != null) {
			System.out.println(++cont + " - " + no.conteudo);
			no = no.proximo;
		}
	}

	public void interrupt(int nro) {
		No no = inicio;
		int cont = 0;
		while (no != null) {
			System.out.println(++cont + " - " + no.conteudo);
			if (no.conteudo == nro)
				break;
			no = no.proximo;
		}
	}

}
