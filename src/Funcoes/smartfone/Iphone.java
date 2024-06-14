package Funcoes.smartfone;

public interface Iphone {
	public default void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	public default void atender() {
		System.out.println("Atendendo Telefone");
	}
	
	public default void iniciarCorreioVoz() {
		System.out.println("Inicianto Correio de voz");
	}
}
