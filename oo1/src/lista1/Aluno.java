package lista1;

public class Aluno {
	
    int ra;
    String nome;
    String curso;
    String turno;
    int periodo;
    double coeficiente;
    String situacao;
    
    public void imprimirDados() {
        System.out.println("RA: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Turno: " + turno);
        System.out.println("Período: " + periodo);
        System.out.println("Coeficiente: " + coeficiente);
        System.out.println("Situação: " + situacao);
    }
}