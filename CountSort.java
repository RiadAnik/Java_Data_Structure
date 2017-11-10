import java.util.Scanner;

public class CountSort {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers you want to test : ");
		int a=sc.nextInt();
		int b;
		int temp;
		int age[]=new int[150];
		System.out.println("Enter the ages (1 to 150) : ");
		for(int i=0;i<a;i++)
		{
			b=sc.nextInt();
			age[b]++;
		}
		System.out.println("The counting sort array is : ");
		for(int i=0;i<age.length;i++)
		{
			temp=age[i];
			for(int j=0;j<temp;j++)
			System.out.print(i+" ");
		}
		

	}

}
