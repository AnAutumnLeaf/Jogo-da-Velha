//Medium
package com.uninter;

public class ComputadorB extends Computador{
	//jogadaComputado da dificuldade Easy, o computador sempre vai preencher a primeira casa vazia em ordem decrescente. 
	@Override
	public void jogadaComputador() {
		for (int i = 2; i >= 0; i--) 
		{
			for (int j = 2; j >= 0; j--) 
			{
				if(Tabuleiro.mat[i][j] != 1 && Tabuleiro.mat[i][j] != 0) 
				{
					Tabuleiro.mat[i][j] = 0;
					i = -1;
					break;
				}	
			}
		}
		
	}

}
