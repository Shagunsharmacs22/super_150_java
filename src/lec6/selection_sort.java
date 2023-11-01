package lec6;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,1,7,3};
//		sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println(Min_value_Index(arr,1));
		

	}
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx=Min_value_Index(arr,i);
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
			
		}
		
	}
	public static int Min_value_Index(int[] arr, int i) {
		int mini=i;
		for (int j = 1+1; j < arr.length; j++) {
			if(arr[j]<arr[mini]) {
				mini=j;
			}
		}
		return mini;
	}

}
