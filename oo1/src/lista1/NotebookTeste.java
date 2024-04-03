package lista1;

public class NotebookTeste {

		public static void main(String[] args) {
			
			Notebook notebook1 = new Notebook();
			
			notebook1.modelo = "Xingue-Lingue";
			notebook1.marca = "Xingue-Lingue";
			notebook1.polegadas = 17;
			notebook1.processador = "Xingue-Lingue";
			notebook1.memoriaRam = 16.0;
			notebook1.armazenamento = 500.0;
			
			System.out.println("======= Notebook 1 =======");
			System.out.println("Notebook: " + notebook1.modelo);
			System.out.println("MArca: " + notebook1.marca);
		
			notebook1.ligar();
		}
}
