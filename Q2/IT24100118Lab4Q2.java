 import java.util.Scanner;
    public class IT24100118Lab4Q2 {


	
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	//take the marks as input
	
	System.out.print("Enter the Exam Marks (out of 100): ");
	int Marks = input.nextInt(); 
	
	//take the lab mark
	
	System.out.print("Enter the Lab marks (out of 100): ");
	int Lab = input.nextInt();
	
	if ( Lab<0 || Lab>100 || Marks>100 || Marks<0) {
	
		System.out.print("The marks you entered is invalid please try again");

	
	}
	
	//enter the percentage taken 
	
	System.out.print("Enter the percentage for Exams: ");
	double P1 = input.nextDouble();

	System.out.print("Enter the percentage for Labs: ");
	double P2 = input.nextDouble();
	
	if( P1+P2>100 || P1+P1<0 ) {
		
		System.out.print("The percentage you entered is invalid please check");
	
	}
		double finalMarks = ( Marks*P1/100 + Lab*P2/100);
	System.out.print("Your final marks is: "+ finalMarks ); 
	
	
	
	input.close();
	}
}