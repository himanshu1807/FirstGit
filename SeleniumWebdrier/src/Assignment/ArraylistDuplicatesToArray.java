package Assignment;

import java.util.ArrayList;
import java.util.Scanner;





public class ArraylistDuplicatesToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

ArrayList <Double> arr = new ArrayList<Double> (10);
ArrayList <Double> arr1 = new ArrayList<Double> ();

int index=0;

for(int i=0;i<=9;i++) {
	arr.add(i,sc.nextDouble());
}

double duplicate;

for(int i=0;i<=8;i++) {
	duplicate= arr.get(i);
	for(int j=i+1;j<=9;j++) {
		if (duplicate==arr.get(j)) {
			arr1.add(index,duplicate);
			index++;
			break;
		}
	}
}


Object [] newarr = arr1.toArray();

for(int i=0;i<=(arr1.size()-1);i++) {
	System.out.println(newarr[i]);
}






sc.close();
	}

}
