package lista1;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
        calc.marca = "Casio";
        calc.modelo = "FX-82MS";
        calc.tipo = "Científica";
        calc.memoriaInterna = 32;
        
        calc.ligar();
        //calc.desligar();
        
        double resultadoSoma = calc.somar(5.5, 2.5);
        System.out.println("Resultado da soma: " + resultadoSoma);
        
        double resultadoSubtracao = calc.subtrair(5.5, 2.5);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        
        double resultadoMultiplicacao = calc.multiplicar(5.5, 2.5);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        
        double resultadoDivisao = calc.dividir(5.5, 2.5);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
        
	}
}
