import java.util.Scanner;
public class Emp2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of hours");
	int hours= sc.nextInt();
	int days= 8 - hours;
	int wage = days*20;
	int wages= 160-wage;
	System.out.println("Daily wages=" + wages);
}
}
