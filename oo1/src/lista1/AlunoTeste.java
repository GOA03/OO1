package lista1;

public class AlunoTeste {
	
	public static void main(String[] args) {
	        
        Aluno aluno1 = new Aluno();
        
        aluno1.ra = 123456;
        aluno1.nome = "João Silva";
        aluno1.curso = "Engenharia";
        aluno1.turno = "Noturno";
        aluno1.periodo = 5;
        aluno1.coeficiente = 8.5;
        aluno1.situacao = "Regular";

        aluno1.imprimirDados();
    }
}
