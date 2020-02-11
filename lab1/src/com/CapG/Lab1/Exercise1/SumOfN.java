package com.CapG.Lab1.Exercise1;
import java.util.Scanner;
public class SumOfN {
	public static int sum(int a)
	{
		int r = 0;
		if(a%3==0 || a%5==0)
		{
			r=(a*(a+1)/2);
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println(sum(a));
 	}
}
