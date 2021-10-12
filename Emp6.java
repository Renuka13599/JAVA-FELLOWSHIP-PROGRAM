import java.util.Scanner;
public class Emp6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of days ");
	int day= sc.nextInt();
	day =20-day;
	int days = 20 -day;
	int hours = days*8;
	int income = hours*20;
		 if(day>=21){
                        System.out.println("Total working days in a month");
                }else if(hours>=100){
			System.out.println("Total working hours in a month");
		}else{
			System.out.println("monthly income="+ income);
}
}
}
