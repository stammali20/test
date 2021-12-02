package Test;

public class Sum {
	
	
		public int add() {
			 int a=5, b=10;
			 
			 int result= a+b;
			 
			 return result;
			 
		
			
		 }
		
		public void mult() {
			
			int c=10, d=20;
			int sub= c*d;
			 System.out.println(sub);
		}
		public static void main(String[] args) {

	Sum add1= new Sum();

	 int x= add1.add();
	 System.out.println(x);
	 
	 add1.mult();
	 
	
		}
	 
	}



