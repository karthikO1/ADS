import java.util.*;
public class binary_search{
	public static int binarysearch(int[] arr,int low,int high,int key){
		if(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(arr[mid]>key){
				return binarysearch(arr,low,mid-1,key);
			}
			else{
				return binarysearch(arr,mid+1,high,key);
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
		int pos=binarysearch(arr,0,n-1,key);
		if(pos==-1){
			System.out.println("The element is not found");
		}
		else{
			System.out.println("The element is found at index:"+pos);
		}
	}
}
