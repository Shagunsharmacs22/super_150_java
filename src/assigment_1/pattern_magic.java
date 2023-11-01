package assigment_1;
import java.util.*;

public class pattern_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n=n*2-1;
		int row=1;
		int star=n/2;
		int space=1;
		while(row<=n) {
			int i=1;
			while(i<=star+1) {
				System.out.print("*");
				i++;
			}
			//space
			int j=1;
			while(j<=space-2) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=star+1) {
				if(k==n/2 +1) {
					System.out.print("");
				}
				else {
				System.out.print("*");}
				k++;
			}
			if (row<=n/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}


	}

}
