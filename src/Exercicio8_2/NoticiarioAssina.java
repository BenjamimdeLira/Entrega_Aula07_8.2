package Exercicio8_2;

import java.util.ArrayList;
import java.util.List;

import Exercicio8_2.Consumidor;
import Exercicio8_2.Noticia;

public class NoticiarioAssina extends Noticiario {
	private List<Consumidor> consumidores = new ArrayList<Consumidor>();
	private Noticia noticia;
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.noticia = new Noticia(textoNoticia,dia, mes, topico);
		this.notificarConsumidores();
	};
	
	public void inscrever(Consumidor consumidor) {
		this.consumidores.add(consumidor);
		System.out.println(consumidor.getNome()+"Inscreveu-se ao Noticiario");
	}
	
	public void notificarConsumidores() {
		System.out.println("--- Notificando Consumidores ---");
		for (Consumidor consumidor : this.consumidores) {
			consumidor.update();
		}
		System.out.println("-----------------------------------------");
	}
	
	public Noticia getNoticia() {
		return this.noticia;
	}
}
