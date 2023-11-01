package assigment_1;

import java.util.Scanner;

public class pascal_traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		while(row<n) {
	         int i = 0;
	         int value = 1;
	         while (i <= row) {
	          System.out.print(value + " ");
	          value = value * (row - i) / (i + 1);
	          i++;
	            }
			row++;
			System.out.println();
		}
		

	}

}
