package lec1;

public class paterrn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=4;i++) {
			for(int j=5;j>=1;j--) {
				if(i==j) {
			    System.out.print("*");
				}
				else {
					System.out.print(j);
				}
				}
			
			System.out.println();
		}		

	}

}
