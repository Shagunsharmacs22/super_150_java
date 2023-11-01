package lec2;

public class patttern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i =1;
			while(space>=i) {
				System.out.print("  ");
				i++;
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
