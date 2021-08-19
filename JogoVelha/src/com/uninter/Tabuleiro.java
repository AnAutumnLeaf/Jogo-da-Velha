package com.uninter;

public  class Tabuleiro 
{
	public static int mat[][] = new int[3][3];
	//Loop para limpar a matriz
	public static void reset() 
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat.length; j++) 
			{
				mat[i][j] = 2;
			}	
		}
	}
	
	//Função que substitui 1 por X, 0 por O e qualquer outro número por -
	public void status()
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat.length; j++) 
			{
				if(mat[i][j] == 1) 
				{
					System.out.printf("X ");
				}
				else if(mat[i][j] == 0) 
				{
					System.out.printf("O ");
				}
				else 
				{
					System.out.printf("- ");
				}
			
			}	
		System.out.println("\n");
		}
	}
	//Função que ler matriz e verifica se já teve uma combinanção vencedora.	
	public int resultado() 
	{
		int a = 2;
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat.length; j++) 
			{
				if((mat[0][0] == mat[0][1]) && (mat[0][0] == mat[0][2])) 
				{
					if(mat[0][0] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[0][0] == 0){
						a = 0;
						return a;
					}
			
					}
		
				else if((mat[1][0] == mat[1][1]) && (mat[1][0] == mat[1][2])) 
				{
					if(mat[1][0] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[1][0] == 0){
						a = 0;
						return a;
					}
			
				}
		
				else if((mat[2][0] == mat[2][1]) && (mat[2][0] == mat[2][2])) 
				{
					if(mat[2][0] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[2][0] == 0){
						a = 0;
						return a;
					}
			
				}
		
				else if((mat[0][0] == mat[1][0]) && (mat[0][0] == mat[2][0])) 
				{
					if(mat[0][0] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[0][0] == 0){
						a = 0;
						return a;
					}
			
				}
				
				else if((mat[0][1] == mat[1][1]) && (mat[1][1] == mat[2][1])) 
				{
					if(mat[0][1] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[0][1] == 0)
					{
						a = 0;
						return a;
					}
			
				}
				else if((mat[0][2] == mat[1][2]) && (mat[1][2] == mat[2][2])) 
				{
					if(mat[0][2] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[0][2] == 0)
					{
						a = 0;
						return a;
					}
			
				}
				else if((mat[0][0] == mat[1][1]) && (mat[0][0] == mat[2][2])) 
				{
					if(mat[0][0] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[0][0] == 0)
					{
						a = 0;
						return a;
					}
						
				}
				else if((mat[0][2] == mat[1][1]) && (mat[1][1] == mat[2][0])) 
				{
					if(mat[0][2] == 1) 
					{
						a = 1;
						return a;
					}
					else if(mat[0][2] == 0)
					{
						a = 0;
						return a;
					}
						
				}
				else 
				{
					return a;
				}
				
			}
		}
		return a;
		}
	

}

