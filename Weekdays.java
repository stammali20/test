import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int day;
		
		System.out.println("please enter the day");
		
		Scanner scan= new Scanner(System.in);
		day= scan.nextInt();
		switch(day){
		
		case 1:
		System.out.println("monday");
		break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
			
		
	}


		
	}

}
