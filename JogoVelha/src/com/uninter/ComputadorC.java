//Hard
package com.uninter;

public class ComputadorC extends Computador{
	// jogadaComputador no modo hard, coloquei condições para deixar a computador mais impresivel.
	@Override
	public void jogadaComputador()
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
			
				if(Tabuleiro.mat[1][1] != 1 && Tabuleiro.mat[1][1] != 0) 	
				{
					Tabuleiro.mat[1][1] = 0;
					i = 3;
					break;
				}
				else if(Tabuleiro.mat[0][2] != 1 && Tabuleiro.mat[0][2] != 0) 	
				{
					Tabuleiro.mat[0][2] = 0;
					i = 3;
					break;
				}
				else if(Tabuleiro.mat[1][0] != 1 && Tabuleiro.mat[1][0] != 0)
				{
					Tabuleiro.mat[1][0] = 0;
					i = 3;
					break;
				}
				else if(Tabuleiro.mat[2][2] != 1 && Tabuleiro.mat[2][2] != 0)
				{
					Tabuleiro.mat[2][2] = 0;
					i = 3;
					break;
				}
				else if(Tabuleiro.mat[i][j] != 1 && Tabuleiro.mat[i][j] != 0) 
				{
					Tabuleiro.mat[i][j] = 0;
					i = 3;
					break;
				}	
			}
		}
	}
}
