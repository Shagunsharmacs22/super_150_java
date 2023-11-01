package leetcode;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,5,7,9,11,13,14,15,18,19,10};

	}
	public static int Search(int [] arr) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
		
	}

}
