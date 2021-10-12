import java.util.Scanner;
public class Emp5{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of days ");
	int day= sc.nextInt();
	 day =20-day;
	int days = 20 -day;
	int hours = days*8;
	int wage = hours*20;
	System.out.println("Monthly wages=" + wage);
}
}
