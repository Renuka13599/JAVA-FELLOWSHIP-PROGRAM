public class Caseemp5{
	public static final int parttime=1;
	public static final int fulltime=2;
	public static final int wageperhr=20;
	public static void main(String[] args){
		int empcheck=(int)Math.floor(Math.random() * 10) %3;
		int workinghrs=0;
		int salary=0;
		switch(empcheck){
		case parttime:
			workinghrs=4;
		break;
		case fulltime:
			workinghrs=8;
		break;
		default:
			System.out.println("Employee wage is 0 and employee is absent");
			salary=workinghrs * wageperhr;
			System.out.println("Empiloyee wage is:" +salary);
		break;
		}
	}
}


