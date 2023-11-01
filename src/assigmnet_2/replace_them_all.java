package assigmnet_2;
import java.util.*;

public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        long sum=0;
		int rev=0;
		int rem;
		while(n!=0) {
		  rem=n%10;
            if(rem!=0){
			rev=rev*10+rem;}
            else{
            rev=rev*10+5;
            }
			n=n/10;
		}
          rem=0;
		while(rev!=0){
            rem=rev%10;
            sum=sum*10+rem;
            rev/=10;

        }
     System.out.print(sum);

	}

}
