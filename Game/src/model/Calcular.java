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
	 * Método para gerar os valores 1 e 2 aleatóriamente, de acordo com a dificuldade escolhida pelo usuário
	 * @param dificuldade
	 */
	public void GerarValores(int dificuldade) {
		this.nivel = dificuldade;
		switch (this.nivel) {
		case 1:
			System.out.println("Nível Fácil");
			this.valor1 = aleatorio.nextInt(10);
			this.valor2 = aleatorio.nextInt(10);
			break;
		case 2:
			System.out.println("Nível Médio");
			this.valor1 = aleatorio.nextInt(100);
			this.valor2 = aleatorio.nextInt(100);
			break;

		case 3:
			System.out.println("Nível Difícil");
			this.valor1 = aleatorio.nextInt(1000);
			this.valor2 = aleatorio.nextInt(1000);
			break;

		default:
			System.out.println("Nivel inválido. tente novamente");

		}
	}
	
	/**
	 * Método para Exibir o Menu Solicitando o nível para o usuário
	 */
	public void NivelMenu() {
		System.out.println("**********************\n*****");

		System.out.println("Favor, escolha o nível: ");

		System.out.println("1 - nível FACIL");
		System.out.println("2 - nível MEDIO");
		System.out.println("3 - nível DIFICIL");
	}

	/**
	 * Método para selecionar o operador de forma aleatória e , em seguida, calcular a expressão
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
	 * Método para adicionar 1 ponto ao Score
	 * @return
	 */
	public int AdcScore() {
		this.score = this.score + 1;
		return score;
	}

	/**
	 * Método para exibir o Score
	 */
	public void ExibeScore() {
		System.out.println("sua pontuação é " + this.score);
	}

	/**
	 * Método para checar se a resposta do usuário está correta e, adicionar o ponto ao Score
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





