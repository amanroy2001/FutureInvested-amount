package codewithaman;
import java.util.Scanner;
public class Futureinvestedamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("please enter amount to be invested,Rate of intrest and number of year");
 double amt=sc.nextDouble();
 double rate=sc.nextDouble();
 double year= sc.nextDouble();
 
 double fiv=amt*Math.pow((1+(rate/1200)), (year*12));
 
 System.out.println("hence the invested amount final value is"+fiv);
	}

}
