package Muutujad;
import java.util.Scanner;
public class tingimuslaused {

	/**
	 * @Helina Raudsepp
	 */
	
	public static void main(String[] args) {
		
		
		
	
		Scanner scan= new Scanner(System.in);
		
		System.out.print(" Sisestage jagatav : ");
		int num = scan.nextInt();
		System.out.print(" Sisestage jagaja : ");
		int numb = scan.nextInt();
		int result = num / numb;
		System.out.println(num +" : "+ numb +" = "+result);
	
	
		 
		   
		return (((num == 0) == (numb == 0)) &&
		        ((num < 0)  == (numb < 0)));
		   
	}
}