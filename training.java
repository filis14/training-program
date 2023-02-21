package projler;
import java.util.Scanner;
public class training {

	private int numberofburpee;
	private int numberofpushup;
	private int numberofsitup;
	private int numberofsquat;
	
	public training(int numberofburpee,int numberofpushup,int numberofsitup, int numberofsquat) {
		this.numberofburpee= numberofburpee;
		this.numberofpushup=numberofpushup;
		this.numberofsitup=numberofsitup;
		this.numberofsquat=numberofsquat;
	}
	
	public void setNumberofburpee(int numberofburpee) {
		this.numberofburpee=numberofburpee;
	}
	public int getNumberofburpee() {
		return numberofburpee;
	}
	
	public void setNumberofpushup(int numberofpushup) {
		this.numberofpushup= numberofpushup;
	}
	public int getNumberofpushup() {
		return numberofpushup;
	}
	
	public void setNumberofsitup(int numberofsitup) {
		this.numberofsitup=numberofsitup;
	}
	public int getNumberofsitup() {
		return numberofsitup;
	}
	
	public void getNumberofsquat(int numberofsquat) {
		this.numberofsquat=numberofsquat;
				
	}
	public int getNumberofsquat() {
		return numberofsquat;
	}
	
	
	
	
	
	
	
	

	public void doburpee(int sayı) {
		Scanner sc= new Scanner(System.in);
		if(sayı>this.numberofburpee) {
			System.out.println("You exceeded your daily goal. Congratulations..");
		}
		else if(sayı==this.numberofburpee) {
			System.out.println("You have reached your daily goal. Congratulations..");
		}
		else {
			System.out.println("You did not reach your daily goal.Sorry...");
			System.out.println("Remaining number of burpees:" + (numberofburpee-sayı));
			
		}
	}
	
	
	public void dopushup(int sayı) {
		Scanner sc= new Scanner(System.in);
		if(sayı>this.numberofpushup) {
			System.out.println("You exceeded your daily goal. Congratulations..");
		}
		else if(sayı==this.numberofpushup) {
			System.out.println("You have reached your daily goal. Congratulations..");
		}
		else {
			System.out.println("You did not reach your daily goal.Sorry...");
			System.out.println("Remaining number of pushups:" + (numberofpushup-sayı));
			
		}
	}
	
	
	
	public void dositup(int sayı) {
		Scanner sc= new Scanner(System.in);
		if(sayı>this.numberofsitup) {
			System.out.println("You exceeded your daily goal. Congratulations..");
		}
		else if(sayı==this.numberofsitup) {
			System.out.println("You have reached your daily goal. Congratulations..");
		}
		else {
			System.out.println("You did not reach your daily goal.Sorry...");
			System.out.println("Remaining number of situps" + (numberofsitup-sayı));
			
		}
	}
	
	
	
	public void dosquat(int sayı) {
		Scanner sc= new Scanner(System.in);
		if(sayı>this.numberofsquat) {
			System.out.println("You exceeded your daily goal. Congratulations..");
		}
		else if(sayı==this.numberofsquat) {
			System.out.println("You have reached your daily goal. Congratulations..");
		}
		else {
			System.out.println("You did not reach your daily goal.Sorry...");
			System.out.println("Remaining number of squats" + (numberofsquat-sayı));
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
