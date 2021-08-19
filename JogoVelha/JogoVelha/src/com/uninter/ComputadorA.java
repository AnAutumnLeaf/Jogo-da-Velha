//Easy
package com.uninter;

public class ComputadorA extends Computador{
	//jogadaComputado da dificuldade Easy, o computador sempre vai preencher a primeira casa vazia em ordem crescente. 
	@Override
	public void jogadaComputador() {
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if(Tabuleiro.mat[i][j] != 1 && Tabuleiro.mat[i][j] != 0) 
				{
					Tabuleiro.mat[i][j] = 0;
					i = 3;
					break;
				}	
			}
		}
		
	}

}
