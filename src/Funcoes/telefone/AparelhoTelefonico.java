package Funcoes.telefone;

import Funcoes.internet.NavegadorInternet;
import Funcoes.musica.ReprodutorMusical;
import Funcoes.smartfone.Iphone;

public class AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical, Iphone {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Iphone reproduzindo musica");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Iphone pausando musica");
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Iphone exibindo pagina " + url);
		
	}



	


}
