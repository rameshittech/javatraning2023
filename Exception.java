package practice;

public class Exception {

	
		public static void main(String[] args) 
		{ 
			
			
			
	   try{
	        int a= 100/0;
	        System.out.println(a);
	        String s=("abc");
	        System.out.println(Integer.parseInt(s));
			String s1=null;
			System.out.println(s1.length());

	       }catch(ArithmeticException k) {
	        System.out.print(k);
	      // k.(PrintStackTrace ("k"));
	}
	   //catch(NumberFormatException n) {
		   //System.out.print(n);
    
	  // }


		System.out.print("hai");	
		}
	}
