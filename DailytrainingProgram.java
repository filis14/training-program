package projler;
import java.util.Scanner;

public class DailytrainingProgram {
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Welcome to daily training program");
	System.out.println("**************************************");
	
	System.out.print("Enter the number of burpees which you aim for:");
	int burpee=sc.nextInt();
	
	System.out.print("Enter the number of pushups which you aim for:");
	int pushup=sc.nextInt();
	
	System.out.print("Enter the number of situps which you aim for:");
	int situp=sc.nextInt();
	
	
	System.out.print("Enter the number of squats which you aim for:");
	int squat=sc.nextInt();
	
	
	training training1=new training(burpee,pushup,situp,squat);
	
	System.out.println("The program is starting..");
	System.out.println("************************************************");
	
	
	System.out.print("The number of burpees that you did:");
	int bp=sc.nextInt(); 
	
	training1.doburpee(bp);
	
	
	System.out.print("The number of pushups that you did:");
	int ph=sc.nextInt(); 
	
	training1.dopushup(ph);
	
	System.out.print("The number of situps that you did:");
	int st=sc.nextInt();
	 
	training1.dositup(st);
	
	
	System.out.print("The number of squats that you did:");
	int sq=sc.nextInt();
	
	training1.dosquat(sq);
	 System.out.println("**********************************************");
	
	
	System.out.println("See you tomorrow..");
	
	
	
	
	
	
}

}

































