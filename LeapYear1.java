package FirstPackage;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int i=3304;
if(i%4==0) {
	if(i%400==0) {
		System.out.println(i+" is a leap year");
	}
	else if(i%4==0 && i%400==0){
		System.out.println(i+" is a leap year");
	}
	else {
		System.out.println(i+" is not a leap year");
	}
}
	}
}
