package lista3;

public class CalculadoraTeste {

		public static void main(String[] args) {
			
			Calculadora cal1 = new Calculadora("Boa", "Numérica", "básica", 64);
			
			System.out.println("Resultado somar: " + cal1.somar(5, 5));
			System.out.println("Resultado subtrair: " + cal1.subtrair(5, 5));
			System.out.println("Resultado multiplicar: " + cal1.multiplicar(5, 5));
			System.out.println("Resultado dividir: " + cal1.dividir(5, 5));
		}
}
