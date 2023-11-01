package leetcode;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,8,6,4,2,1};

	}
	public static void Permutation(int [] arr) {
		int p=-1;
		for(int i = arr.length-2;i>=0; i--) {
			if( arr[i] <arr[i+1]) {
				p=i;
				break;
			}
			
		}
		int q=-1;
		for(int i = arr.length-1;i>p; i--) {
			if( arr[i] >arr[p]) {
				q=i;
				break;
			}
		}
	}

}
