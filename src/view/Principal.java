package view;
import controller.QtdDigit;

public class Principal {

	public static void main(String[] args) {
		int vetor[] = {1, 9, 2, 20, 11, 5, 10};
		int size = vetor.length;
	
		QtdDigit qd = new QtdDigit ();
		int digitos = qd.digitos(vetor, size);
		System.out.println(digitos);
}
}
