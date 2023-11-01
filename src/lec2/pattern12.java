package lec2;
import java.util.*;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(space>=i) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(star>=j) {
				if(j%2!=0) {
				System.out.print("* ");
				}
				else {
					System.out.print("! ");
				}
				j++;
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}

	}

}
