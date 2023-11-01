package assigment_1;
import java.util.*;

public class pattern_num_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=row) {
				System.out.print(val+" ");
				val++;
				i++;
			}
			row++;
			System.out.println();
			
		}
		

	}

}
