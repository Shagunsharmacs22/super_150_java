package assigment_1;
import java.util.*;

public class pattern_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=val) {
				if(i==1 || i==val) {
				System.out.print(val+" ");
				}
				else {
					System.out.print("0 ");
				}
				i++;
			}
			row++;
			val++;
			System.out.println();
		}

	}

}
