package lec1;

import java.util.Scanner;

public class pattern_hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int i=1;
	    int j=1;
	    for(i=1;i<=n;i++){
	        for(j=1;j<=n-i;j++){
	            System.out.print(" ");
	        }
	        if(i==1 || i==n){
	            for(j=1;j<=n;j++){
	                System.out.print("*");
	            }
	        }
	        else{     
	            for(j=1;j<=n;j++){
	                if(j==1 || j==n){
	                System.out.print("*");}
	                else{
	                    System.out.print(" ");
	                }
	        }
	        }
	        System.out.println();
	    }	
	}
}
