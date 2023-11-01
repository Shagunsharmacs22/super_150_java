package lec1;

public class grade_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=78;
		if(m>=90) {
			System.out.println("grade is A");
		}
		else if(m<90 && m>=80) {
			System.out.println("grade is B");
		}
		else if(m<80 && m>=70) {
			System.out.println("grade is C");
		}
		else if(m<70 && m>=50) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
