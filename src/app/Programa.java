package app;

import java.util.Scanner;

import entidades.Aeronave;
import entidades.Aeroporto;

public class Programa {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		do {
			menu();
			opcao = sc.nextInt();
			processaOpcao(opcao);
			
		}while(opcao != 0);

	}

	private static void processaOpcao(int opcao) {
		
		Aeroporto aeroporto = new Aeroporto();
		
		switch(opcao) {
		case 1:
			entrarFilaPouso(aeroporto);
			break;
		case 2:
			entrarFilaDecolagem();
			break;
		case 3:
			entrarFilaPousoContigencia();
			break;
		case 4:
			pousar();
			break;
		case 5:
			decolar();
			break;
		case 0:
			System.out.println("\nPROGRAMA ENCERRADO!!!");
			break;
		default:
			System.out.println("\nOpção inválida, Tente novamente.");
		}
		
	}

	private static void decolar() {
		// TODO Auto-generated method stub
		
	}

	private static void pousar() {
		// TODO Auto-generated method stub
		
	}

	private static void entrarFilaPousoContigencia() {
		// TODO Auto-generated method stub
		
	}

	private static void entrarFilaDecolagem() {
		// TODO Auto-generated method stub
		
	}

	private static void entrarFilaPouso(Aeroporto aeroporto) {
		aeroporto.addFilaPouso(new Aeronave("xyz"));
		System.out.println(aeroporto);
	}

	private static void menu() {
		System.out.println();
		System.out.println("	1. Entrar fila de pouso");
		System.out.println("	2. Entrar fila de decolagem");
		System.out.println("	3. Emergência");
		System.out.println("	4. Pousar");
		System.out.println("	5. Decolar");
		System.out.println("	0. Encerrar");
		System.out.println();
		System.out.print("Digite a opção: ");
		
	}

}
