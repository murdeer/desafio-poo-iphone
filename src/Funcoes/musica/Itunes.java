package Funcoes.musica;

public class Itunes implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando m�sica itunes: ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar m�sica itunes");
		
	}

}
