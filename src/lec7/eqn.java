package lec7;

import java.util.Iterator;

public class eqn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		double ans=Integer.MIN_VALUE;
		int n=146;
       for(int i=1; ;i++) {
    	   double r=Math.pow(i, k);
    	   if(r<=n) {
    	   ans=Math.max(ans, i);
    	   }
    	   else {
    		   System.out.println((int)ans);
    		   break;
    	   }
       }


	}

}
