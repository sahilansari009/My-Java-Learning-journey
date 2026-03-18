import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name =sc.nextLine();
		
		System.out.println("Enter Marks (0-100): ");
		int marks=sc.nextInt();
		
		System.out.println("/n--- Result Card ---");
		
		if(marks>=80){
		    System.out.println("Congratulations " + name +"! Grade: A");
		}
		else if(marks>=60){
		    System.out.println("Well done " + name +"! Grade: B");
		}
		else if(marks>=33){
		    System.out.println("Good " + name +"! Result: Passed");
		}
		else{
		    System.out.println("Sorry " + name +"! Result: Failed. Better Luck Next Time.");
		}
		sc.close();
	}
}
