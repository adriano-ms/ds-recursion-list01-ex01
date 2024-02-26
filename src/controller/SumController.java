package controller;

public class SumController {
	
	public SumController() {
		super();
	}
	
	public int sum(int n) {
//		Quando 'n' = 0 significa que o ultimo numero foi somado
//		Caso 'n' < 0, imediatamente o metodo retornara 0
		if(n <= 0) {
			return 0;
		} else {
//		Somado o 'n' atual ao resultado da funcao que recebe o numero anterior a 'n' como parametro
			return n + sum(n - 1);
		}
	}
}
