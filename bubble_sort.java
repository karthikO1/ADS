import java.util.*;
public class bubble_sort{
	public static void bubblesort(int[] arr, int n){
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements in the array:");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting:");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("After sorting:");
		bubblesort(arr,n);
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
