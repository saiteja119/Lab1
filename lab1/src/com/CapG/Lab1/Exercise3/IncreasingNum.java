package com.CapG.Lab1.Exercise3;
import java.util.Scanner;
public class IncreasingNum {
	public static boolean rise(int n)
	{
		while(n>0)
		{
			int post=n%10;
			n=n/10;
			if(post<n%10)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	System.out.println(rise(n));
	}
}
