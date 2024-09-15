import java.util.Scanner;
public class IO{
	public static void main(String [] arge){
		Scanner scan=new Scanner (System.in);
		System.out.println("enter your Id : ");
		int id = scan.nextInt();
		System.out.println("enter your Name : ");
		String Name =scan.next();
		System.out.println("enter your LastName : ");
		char LastName =scan.next().charAt(0);
		System.out.println("enter your Salary : ");
		String Salary = scan.next();
		//double sal=scan.parseDouble(Salary);
		
		System.out.println("your Id is : "+id);
		System.out.print("your Name is : "+Name);System.out.println(" "+LastName);
		
		System.out.println("your Salary is : "+Salary);
		
	}
}
