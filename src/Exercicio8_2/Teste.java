package Exercicio8_2;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Dr Claudemir", noticiario);
	noticiario.notificaNoticia("Chegaram as Ferias", 1, 2, "Topico:Turismo");
	new Consumidor("Thais", noticiario);
	noticiario.notificaNoticia("Lancamento do novo NoteBook Acer", 2, 2, "Topico:Tecnologia");
	
	
	}
}
