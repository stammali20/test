import java.util.Scanner;

public class Multiplication {

	


	public static void main(String[] args) {

int i, j;

System.out.println("Please enter any number:");

Scanner scan= new Scanner(System.in);
i=scan.nextInt();


for(j=1;j<=10;j++) {
	
	System.out.println(i+ "*"+j+"=" +i*j);
	
}

		

	}

}
