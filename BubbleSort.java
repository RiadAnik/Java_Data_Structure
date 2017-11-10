package Sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number you want to test :");
		int a=sc.nextInt();
		
		int ar[]=new int[a];
		System.out.println("Enter the numbers :");
		for(int i=0;i<a;i++)
		{
		ar[i]=sc.nextInt();
		}
		int b;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar.length-1;j>i;j--)
			{
				b=0;
				if(ar[j]<ar[i])
				{
					b=ar[j];
					ar[j]=ar[i];
					ar[i]=b;
				}
				else{
					continue;
				}
			}
		}
		System.out.print("The bubble sorted array : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		}

}
