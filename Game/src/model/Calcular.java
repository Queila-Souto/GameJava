package model;

import java.util.Random;
import java.util.Scanner;

public class Calcular {
	private int valor1;
	private int valor2;
	private int operacao;
	private int nivel;
	private int resultado;
	private int score;
	private int respostaUsuario;
	static Scanner ler = new Scanner(System.in);
	Random aleatorio = new Random();

	/**
	 * M�todo para gerar os valores 1 e 2 aleat�riamente, de acordo com a dificuldade escolhida pelo usu�rio
	 * @param dificuldade
	 */
	public void GerarValores(int dificuldade) {
		this.nivel = dificuldade;
		switch (this.nivel) {
		case 1:
			System.out.println("N�vel F�cil");
			this.valor1 = aleatorio.nextInt(10);
			this.valor2 = aleatorio.nextInt(10);
			break;
		case 2:
			System.out.println("N�vel M�dio");
			this.valor1 = aleatorio.nextInt(100);
			this.valor2 = aleatorio.nextInt(100);
			break;

		case 3:
			System.out.println("N�vel Dif�cil");
			this.valor1 = aleatorio.nextInt(1000);
			this.valor2 = aleatorio.nextInt(1000);
			break;

		default:
			System.out.println("Nivel inv�lido. tente novamente");

		}
	}
	
	/**
	 * M�todo para Exibir o Menu Solicitando o n�vel para o usu�rio
	 */
	public void NivelMenu() {
		System.out.println("**********************\n*****");

		System.out.println("Favor, escolha o n�vel: ");

		System.out.println("1 - n�vel FACIL");
		System.out.println("2 - n�vel MEDIO");
		System.out.println("3 - n�vel DIFICIL");
	}

	/**
	 * M�todo para selecionar o operador de forma aleat�ria e , em seguida, calcular a express�o
	 */
	public void Operacao() {
		this.operacao = aleatorio.nextInt(3);
		if (operacao == 0) {
			this.resultado = this.valor1 + this.valor2;
			System.out.println(this.valor1 + " + " + this.valor2 + " = ?");
		} else if (operacao == 1) {
			this.resultado = this.valor1 - this.valor2;
			System.out.println(this.valor1 + " - " + this.valor2 + " = ?");
		} else if (operacao == 2) {
			this.resultado = this.valor1 * this.valor2;
			System.out.println(this.valor1 + " * " + this.valor2 + " = ?");
		}

	}

	/**
	 * M�todo para adicionar 1 ponto ao Score
	 * @return
	 */
	public int AdcScore() {
		this.score = this.score + 1;
		return score;
	}

	/**
	 * M�todo para exibir o Score
	 */
	public void ExibeScore() {
		System.out.println("sua pontua��o � " + this.score);
	}

	/**
	 * M�todo para checar se a resposta do usu�rio est� correta e, adicionar o ponto ao Score
	 */
	public void Checagem() {
		System.out.println("Digite a sua resposta");
		respostaUsuario = ler.nextInt();
		if (this.resultado == respostaUsuario) {
			System.out.println("Resposta correta");
			AdcScore();
			ExibeScore();
		} else {
			System.out.println("Resposta incorreta");
			ExibeScore();
		}
	}
}





