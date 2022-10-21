import java.util.Scanner;
class Insertionsort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the total no. of elements: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int key,j,k;
		for(j=1;j<n;j++)
		{
			key=arr[j];
			for(k=j-1;k>=0 && arr[k]>key; k--)
			{
				arr[k+1]=arr[k];
			}
			arr[k+1]=key;
		}
		System.out.println("Sorted array is: ");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}