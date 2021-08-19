package com.uninter;

import java.util.Scanner;

public abstract class Partida {

	public static void main(String[] args) 
	{
		System.out.println("\t Bem vindo ao Jogo da Velha!!!");
		Jogador humano = new Jogador();
		Tabuleiro tab = new Tabuleiro();
		int i = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nDigite o seu nome jogador: ");
		humano.nome = teclado.next();
		tab.reset();
		//Fazer o usuario escolher um dificuldade e que seja valida
		System.out.printf("Ola %s !!! Temos as seguintes dificuldades:", humano.nome);
		int dificuldade;
		
		do{
			System.out.println("\n1-Easy\n2-Medium\n3-Hard");
			System.out.println("\nEscolha uma:");
			dificuldade = teclado.nextInt();
		}while(dificuldade < 1 || dificuldade > 3);
		
		//Instancia a forma de jogo do computador de acordo com a dificuldade escolhida
		Computador adversario = null;
		if(dificuldade == 1) {
			adversario = new ComputadorA();
		}
		else if(dificuldade == 2) {
			adversario = new ComputadorB();
		}
		else{
			adversario = new ComputadorC();
		}

		
		// mensagem de acordo com a dificuldade que for escolhida 
		switch(dificuldade) 
		{
			case 1:
				System.out.println("Vamos começar por baixo! Um degrau de cada vez");
				break;
			case 2:
				System.out.println("Agora um pouco de dificuldade...");
				break;
			case 3:
				System.out.println("Aceite a sua derrota para a maquina!!!");
				break;
		}
		
		System.out.println("\nDica: Lembrado que o tabuleiro tem nove posições, sendo que são 3 linhas(0, 1 e 2) e 3 colunas(0, 1 e 2)");
		tab.status();
		//Controle da partida em si, informa a situação do jogo e quem ganhou. 
		while( i < 9) 
		{	
			if(tab.resultado() != 0 && tab.resultado() != 1) 
			{
				System.out.println("\nSua vez!");
				Jogador.jogadaJogador();
				System.out.println("\n");
				i++;
				tab.status();
				tab.resultado();
				System.out.println("Agora a vez da maquina!");
				adversario.jogadaComputador();
				System.out.println("\n");
				tab.status();
				tab.resultado();
				if(tab.resultado() == 1) 
				{
					System.out.println("Parabéns!! Você ganhou.");
					break;
				}
				
				else if(tab.resultado() == 0) 
				{
					System.out.println("Você perdeu e o dominio das maquinas começou....");
					break;
				}
				else if(i > 9) 
				{
					System.out.println("Empatou, tente novamente.");
					break;
				}
				else 
				{
					System.out.println("O jogo está empatado.");

				}
				i++;
			}
		}

	}
}
