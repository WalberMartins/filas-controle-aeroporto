package entidades;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Aeroporto {
	private Queue<Aeronave> filaPouso = new LinkedList<>();
	private Queue<Aeronave> filaDecolagem = new LinkedList<>();
	private Queue<Aeronave> filaPousoContingencia = new LinkedList<>();
	
	public Aeroporto() { }

	public Queue<Aeronave> getFilaPouso() {
		return filaPouso;
	}

	public Queue<Aeronave> getFilaDecolagem() {
		return filaDecolagem;
	}

	public Queue<Aeronave> getFilaPousoContingencia() {
		return filaPousoContingencia;
	};
	
	public void addFilaPouso(Aeronave aeronave) {
		filaPouso.add(aeronave);
	}
	
	public Aeronave removeFilaPouso() throws NoSuchElementException {
		return filaPouso.remove();
	}
	
	public void addFilaDecolagem(Aeronave aeronave) {
		filaDecolagem.add(aeronave);
	}
	
	public Aeronave removeFilaDecolagem() throws NoSuchElementException {
		return filaDecolagem.remove();
	}
	
	public void addFilaPousoContingencia(Aeronave aeronave) {
		filaPousoContingencia.add(aeronave);
	}
	
	public Aeronave removeFilaPousoContingencia() throws NoSuchElementException {
		return filaPousoContingencia.remove();
	}

}
