import java.util.*;
public class linear_search{
	public static int linearsearch(int[] arr,int n,int key){
		for(int i=0; i<n; i++){
			if(arr[i]==key){
				return i;	
			}
		}
		return -1;
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
		System.out.println("Enter key search:");
		int key=sc.nextInt();
		int pos=linearsearch(arr,n,key);
		if(pos==-1){
			System.out.println("The element is not found");
		}
		else{
			System.out.println("The element is found at index:"+pos);
		}
	}
}
