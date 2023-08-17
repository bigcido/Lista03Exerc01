package controller;

public class QtdDigit {

	public QtdDigit() {
		super();
	}
	public int digitos(int[] vetor, int tamanho){
		/* transformei cada numero em um vetor. Então a primeira parada é quando o tamanho do
		 * vetor é zerado.
		 */
		if (tamanho == 0) {
			return 0;
		} else {
			int ultPos = tamanho - 1;
			int vtr = vetor[ultPos];
			/* 
			 * Essa parada verifica o vetor e, se a posição for menor que 0, soma 1. Quando for zero, retorna 
			 * o vetor 
			 */
				if (vtr < 0) {
					return 1 + digitos(vetor, tamanho - 1);
				} else {
					return digitos(vetor, tamanho-1);
				}
		}
	}
}
//vetor. 