package Test;

public class PrintLumbers {

	public static void main(String[] args) {
		
		String l= "level";
		StringBuffer r = new StringBuffer();
		for(int i=l.length()-1; i>=0;i--) {
			r.append(l.charAt(i));		
		}	
		System.out.println(l);
		System.out.println(r);
		if (r.toString().equals(l)) {
			System.out.println("it is a palindrome");
		}
		
	}

}

