package lec2;
import java.util.*;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int row=1;
		 int space=n-1;
			int star=1;
		 while(row<=n) {
			 int i=1;
				while(i<=row) {
					System.out.print("* ");
					i++;
		 }
				int k =1;
				while(space>=k) {
					System.out.print("    ");
					k++;
				}
				int j=1;
				while(star>=j) {
					System.out.print("* ");
					j++;
				}
				row++;
				star++;
				space--;
				System.out.println();
	}

	}
}
