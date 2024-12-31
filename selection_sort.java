import java.util.*;
public class selection_sort{
	public static void selection_sort(int[] arr,int n){
		for(int i=0; i<n-1; i++){
			int minpos=i;
			for(int j=i+1; j<n; j++){
				if(arr[j]<arr[minpos]){
					minpos=j;
				}
			}
			int temp=arr[minpos];
			arr[minpos]=arr[i];
			arr[i]=temp;
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
		selection_sort(arr,n);
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
