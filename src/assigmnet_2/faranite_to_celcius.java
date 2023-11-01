package assigmnet_2;

import java.util.Scanner;

public class faranite_to_celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int Min=sc.nextInt();
	    int Max=sc.nextInt();
	    int Step=sc.nextInt();
	    int cel;
	    while(Min<=Max) {
	    	cel =(Min-32)*5/9;
	    	System.out.println( Min+"\t"+cel);
	    	Min+=Step;
	    	
	    	
	    }

	}

}
