package anzixuzhou.daw.ede;

public class CalculadoraDemo {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println("2+4= " + calc.sumar(2, 4));
		
		System.out.println("2+4= " + calc.restar(4, 1));

		System.out.println("2+4= " + calc.dividir(6, 3));
		
		System.out.println("2+4= " + calc.multiplicar(2, 4));
	}

}
