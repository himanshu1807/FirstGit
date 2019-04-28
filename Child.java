package FirstPackage;

import java.util.Scanner;

public class Child extends Parent{
	
	
	public void multiply(int a, int b) {
		super.add(a, b);
		int c=a*b;
		System.out.println("child multiply:"+c);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st no.:");
		int a=sc.nextInt();
		System.out.println("enter 2nd no.:");
		int b = sc.nextInt();
		
		Parent p=new Parent();
		Child c=new Child();
		
		
		
		
		//c.add(a, b);
		p.multiply(a, b);
		System.out.println("addition:"+c.e);
		p.add(a, b);
		//System.out.println(c.e);
sc.close();		
		
	}

}
