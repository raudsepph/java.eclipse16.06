package Muutujad;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		
		
		//programm lubamaks kasutajal sisestada suvalist teksti ning seejärel väljastamaks seda seejärel suurtähtedes
		 Scanner sc= new Scanner(System.in);
		 String str="";
		 System.out.print("sisestage tekst: ");
		 str=sc.nextLine();
		 String upperCaseString="";
		 upperCaseString= str.toUpperCase();
		 System.out.println(upperCaseString);
		  
		 
		 //programm lugemaks teksti märkide arvu
		 String exampleString = str;
		 int stringLength = exampleString.length();
		 System.out.println("märkide arv on: " + stringLength);

		 
		 
		 
	}
}
	
		 //programm lugemaks sõnade arvu	  
 class StringOperator
{
   public static int countWordsinStr(String str){
        int count = 1;
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
   public static void main(String args[]){
        String str;
        Scanner scan = new Scanner(System.in);
 
        System.out.print("sisestage lause : ");
        str = scan.nextLine();
 
        System.out.print("sõnu lauses on " + countWordsinStr(str)); 

	}
}
		
	



		
		
		
		
		
		
		
		
	
	


