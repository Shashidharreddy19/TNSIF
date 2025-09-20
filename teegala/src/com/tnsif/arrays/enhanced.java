package com.tnsif.arrays;

public class enhanced {

	public static void main(String[] args) {
		int[][] num=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				num[i][j]=(int)(Math.random()*10);
				
			}
		}
		for (int[] x:num) 	//enhanced loop
		{
			for (int y:x) {
				System.out.print(y+" ");
				
			}
			System.out.println();
		}
	}

}
