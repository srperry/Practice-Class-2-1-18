import java.util.Scanner;
public class HumanTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your First name, Last name, Middle initial, Career, and your Age.");
	String FirstName = scanner.nextLine();
	String LastName = scanner.nextLine();
	String MiddleInt = scanner.nextLine();
	String Career = scanner.nextLine();
	int YearsOld = scanner.nextInt();
	
Human human1 = new Human(FirstName, LastName, MiddleInt, Career, YearsOld);
	System.out.println(human1.FirstName);
	System.out.println(human1.MiddleInt);
	System.out.println(human1.LastName);
	System.out.println(human1.YearsOld);
	System.out.println(human1.Career);
	
	}
}