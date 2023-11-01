package assigmnet_2;
import java.util.*;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t!=0){
	            int n1= sc.nextInt();
	            int n2=sc.nextInt();
	            int i=1;
	            int odd=0;
	            int even=0;
	            while(i!=0) {
	            	if(i%2!=0) {
	            		
	            		if(odd<n1) {
	            			odd=odd+i;
	            		}
	            		else {
	            			System.out.println("Harshit");
	            			break;
	            		}
	            		i++;
	            	}
	            	else {
	            		
	            		if(even<n2) {
	            			even=even+i;
	            		}
	            		else {
	            			System.out.println("Aayush");
	            			break;
	            		}
	            		i++;
	            	}
	            	
	            }
	          
	            t--;
	        }

	}

}
