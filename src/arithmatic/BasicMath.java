package arithmatic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath {

	public static void main(String[] args) throws Exception, IOException {
		int ch;
		float num1, num2;
		double result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the arithmatic operation you would like to perform for 2 numbers:");
		System.out.println("1. Perform Addition");
	    System.out.println("2. Perform Subtraction");
	    System.out.println("3. Perform Division");
	    System.out.println("4. Perform Multiplication");
	    
	    ch=Integer.parseInt(br.readLine());
	       switch(ch){
	           case 1: 
	        	   System.out.println("Enter the 2 numbers to add: num1 & num2");
	               num1 = Float.parseFloat(br.readLine());
	               num2 = Float.parseFloat(br.readLine());
	        	   if (num1>=0 && num2>=0)
	        	   		{
	        	   		result = num1+num2;
	        	   		System.out.println("The result is "+result);
	        	   		}
	        	   else
	        		   System.out.println("Both numbers have to be greater than or equal to 0 to perform addition");   
	               break;
	           case 2:
	        	   System.out.println("Enter the 2 numbers to subtract(smaller number will be sutracted from greater): num1 & num2");
	               num1 = Float.parseFloat(br.readLine());
	               num2 = Float.parseFloat(br.readLine());
	        	   if (num1>=0 && num2>=0)
       	   				{
	        		   if(num1>num2)
	        			  result = num1-num2;
	        		   else
	        			  result = num2-num1;	
	        		   System.out.println("The result is "+result);
       	   				}
	        	   else
	        		   System.out.println("Both numbers have to be greater than or equal to 0 to perform subtraction"); 
	               break;
	               
	           	case 3:
	           		System.out.println("Enter the numerator of division");
	                num1 = Float.parseFloat(br.readLine());
	                System.out.println("Enter the denominator of division");
	                num2 = Float.parseFloat(br.readLine());
	           		if (num1>=0 && num2>0)
       	   				{
	        		   result = num1/num2;
	        		   System.out.println("The result is "+result);
       	   				}
	        	   else
	        		   System.out.println("Both numbers have to be greater than 0 to perform division"); 
	               break;
	               
	           case 4:
	           	   System.out.println("Enter the 2 numbers to multiply: num1 & num2");
	               num1 = Float.parseFloat(br.readLine());
	               num2 = Float.parseFloat(br.readLine());
	        	   if (num1>=0 && num2>=0)
	        		   		{
	        			   		result = num1*num2;
	        			   		System.out.println("The result is "+result);
	        		   		}
	        	   else
	        		   System.out.println("Both numbers have to be greater than or equal to 0 to perform multiplication");

	               break;
	       }

	}

}
