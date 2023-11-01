package assigment_1;
import java.util.*;

public class fibonnacci_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=2;
		int a;
		int b=1;
		int c=0;
		System.out.println(0+"\t");
		while(row<=n) {
			int i=1;
			while(i<=row) {
				a=b;
				b=c;
				c=a+b;
				System.out.print(c+"\t");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
