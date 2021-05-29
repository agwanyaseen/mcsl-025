import java.util.*;
class Student
{
	public static void main(String[] args)
	{
		double subject1,subject2,subject3,subject4,subject5;
		double average;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks for Subject");
		System.out.println("Subject 1");
		subject1 = in.nextDouble();
		System.out.println("Subject 2");
		subject2 = in.nextDouble();
		System.out.println("Subject 3");
		subject3 = in.nextDouble();
		System.out.println("Subject 4");
		subject4 = in.nextDouble();
		System.out.println("Subject 5");
		subject5 = in.nextDouble();

		average= (subject1 + subject2 +subject3 +subject4 +subject5)/5;

		System.out.println("Average: "+ average);

	}
}