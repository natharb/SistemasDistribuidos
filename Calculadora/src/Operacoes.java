
public class Operacoes{
	
	public double soma(double a, double b){
		double soma = a+b;
		return soma;
	}
	
	public double subtracao(double a, double b){
		if(a>b){
			return a-b;
		}
		else{
			return b-a;
		}
	}
	
	public double multiplicacao(double a, double b){
		return a*b;
	}

	public double divisao(double a, double b) throws ArithmeticException{
		return a/b;
	}
}
