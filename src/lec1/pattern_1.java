package lec1;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=2*i-1;j++) {
				if(j%2!=0) {
					System.out.print(i);
				}
				else {
					System.out.print("*");
				
					}
				}
			
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=2*i-1;j++) {
				if(j%2!=0) {
					System.out.print(i);
				}
				else {
					System.out.print("*");
				
					}
				}
			
			System.out.println();
		}
		
		

	}

}
