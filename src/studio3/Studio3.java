package studio3;

import java.util.Scanner;

public class Studio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner in = new Scanner(System.in);


		System.out.print("To what number do you want to find prime numbers?: ");
		int n = in.nextInt();


		boolean [] array = new boolean [n];

		for (int row = 0; row <= n-1; row++)
		{ 
			array [row] = true;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++)
		{
			if(array[i]==true)
			{
				for(int j = i*i;j<n;j+=i)
				{
					array[j]=false;
				}
			}
		}
		for(int i = 0;i<n-1;i++)
		{
			if(array[i]==true)
			{
				System.out.println(i);
			}
		}
	}

}
