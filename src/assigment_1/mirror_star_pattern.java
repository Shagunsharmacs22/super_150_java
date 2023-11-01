package assigment_1;
import java.util.*;

public class mirror_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n/2;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=2*star-1) {
				System.out.print("* ");
				j++;
			}
			if(row<n/2+1) {
				space--;
				star++;
				row++;
				System.out.println();
			}
			else {
				space++;
				star--;
				row++;
				System.out.println();
			}
			
		}

	}

}
