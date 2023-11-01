package assigment_1;

import java.util.Scanner;

public class pattern_doubleside_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=2*(n/2);
		int star=1;
		int space1=0;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val=row;
			 int val1=n-row+1;
			while(j<=star) {
			
				if(row<=n/2+1) {
					System.out.print(val+" ");
				val--;}
				else {
					
					System.out.print(val1+" ");
					val1--;
				}
				j++;
			}
			int k=1;
			while(k<space1) {
				System.out.print("  ");
				k++;
				
			}
			int p=1;
			while(p<=star) {
				if(row==1 || row==n) {
					System.out.print("");
				}
				else {
				System.out.print(p+" ");
				}
				p++;
			}
			if(row<n/2+1) {
			space1+=2;
			star++;
			space-=2;}
			else {
				space1-=2;
				star--;
				space+=2;
			}
			row++;
			System.out.println();
		}

	}

}
