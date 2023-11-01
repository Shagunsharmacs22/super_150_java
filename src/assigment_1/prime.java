package assigment_1;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int c=0;
		while(i<n) {
			if(n%i==0) {
				c+=1;
				break;
			}
			i++;
		}
		if(c==0) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not Prime");
		}
		
		

	}

}
