package lec1;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6792;
		int sum=0;
		int r;
	    while (n!=0) {
	    	r=n%10;
	    	sum=sum*10+r;
	    	n=n/10;
	    }
System.out.println(sum);
	
	}

}
