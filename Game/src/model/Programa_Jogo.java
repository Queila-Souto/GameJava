package model;

import java.util.Scanner;

public class Programa_Jogo {
	static Calcular novoJogo = new Calcular();
	static Scanner ler = new Scanner(System.in);
/**
 * No m�todo principal foi utilizada a estrutura de repeti��o While
 * @param args
 */
	public static void main(String[] args) {
		int c;
		do {
			jogar();
			System.out.println("Deseja continuar: Digite 0 para sim");
			c = ler.nextInt();
		} while (c == 0);
	}
/**
 * No m�todo jogar eu ordeno a execu��o do programa, de acordo com os m�todos da classe Calcular.
 */
	public static void jogar() {
		novoJogo.NivelMenu();
		novoJogo.GerarValores(ler.nextInt());
		novoJogo.Operacao();
		novoJogo.Checagem();
		}
}