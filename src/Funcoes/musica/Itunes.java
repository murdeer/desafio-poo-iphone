package Funcoes.musica;

public class Itunes implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando música itunes: ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar música itunes");
		
	}

}
