import java.util.*;
public class insertion_sort{
	public static void insertionsort(int[] arr,int n){
		for(int i=1; i<n; i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting:");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("After sorting:");
		insertionsort(arr,n);
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
