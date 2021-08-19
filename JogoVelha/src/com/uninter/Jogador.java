package com.uninter;

import java.util.Scanner;

public class Jogador {
	public String nome;
	//Função que vai permitir ao jogador fazer sua jogada
	public static void jogadaJogador() 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é a linha? ");
		int linha = teclado.nextInt();
		System.out.println("\nQual é a coluna? ");
		int coluna = teclado.nextInt();
		
		if(linha > 2 || linha < 0) 
		{
			System.out.println("\nValor inválido!!");
			jogadaJogador();
		}
		else if(coluna > 2 || coluna < 0) 
		{
			System.out.println("\nValor inválido!!");
			jogadaJogador();
		}
		else 
		{	
			if(Tabuleiro.mat[linha][coluna] == 1 || Tabuleiro.mat[linha][coluna] == 0) 
			{
				System.out.println("Já tem algo nessa posição...");
				jogadaJogador();
			} 
			else 
			{
				Tabuleiro.mat[linha][coluna] = 1;
			}
		}
	}

}
