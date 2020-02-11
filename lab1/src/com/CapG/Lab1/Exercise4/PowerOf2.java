package com.CapG.Lab1.Exercise4;
import java.util.*;
public class PowerOf2 {
	static boolean power(int a)
	{
		while(a!=1)
		{
			if(a%2!=0)
				return false;
			a=a/2;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println(power(a));
	}

}
