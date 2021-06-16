package numbritemaailm;

import java.util.Scanner;

public class numbritemaailm { 
//elltoodud alamprogramm on loodud tollide teisendamiseks meetritesse.
	public static void main(String[] Strings) {
	
		Scanner input = new Scanner(System.in);

    System.out.print("Sisesta väärtus tollides : ");
    double inch = input.nextDouble();
    double meters = inch * 0.0254;
    System.out.println(inch + " tolli on " + meters + " meetrit.");

    }
}





class EllipsiPindala {
//järgnev programm on loodud ellipsi pindala leidmiseks ümardatuna sajalisteni.
	
	static void LeiaPindala( float a, float b)
    {
       
		float Pindala;
        
        Pindala = (float)3.142 * a * b ;
        
        System.out.println("Antud ellipsi pindala on " + Pindala);
    }
        public static void main (String[] args)
        {
            float a = 0, b = 4;
             
            LeiaPindala(a, b);
    }
}





class Teisendaja {
//järgnev programm on loodud etteantud minutite tundideks ja minutiteks teisendamiseks.
 
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("sisestad minutid : ");
		int sekundid = in.nextInt(); 
		int a1 = sekundid % 60;
        int a2 = sekundid / 60;
        int a3 = a2 % 60;
        a2 = a2 / 60;
        System.out.print(  a3 + ":" + a1 );
		System.out.print("\n");
    }    
 }





class Võrdleja {
//järgnev programm on loodud kahe sportlase kiiruste ja nende vahe leidmiseks.
	
	
	public static void main(String args[])  
	{
		//esimese sportlase aeg
		Scanner in = new Scanner(System.in);
		System.out.print(" aeg: ");
		int kiirus = in.nextInt();
		System.out.print(" distants: ");
		int distants = in.nextInt();
		float aeg = (float)distants / kiirus;
		System.out.println("   esimese sportlase kiirus on " + aeg + " km/h. ");
		   
		//teise sportlase aeg
		Scanner inb = new Scanner(System.in);
		System.out.print(" aeg: ");
		int kiirusb = in.nextInt();
		System.out.print(" distants: ");
		int distantsb = in.nextInt();
		float aegb = (float)distantsb / kiirusb;
		System.out.println("   teise sportlase kiirus on " + aegb + " km/h. ");
	
	
//järgnev programm on loodud leidmaks kahe kiiruse vahe 
		if (aeg>aegb) ;
		float vahe = (float) aeg - aegb;
		
		if (aegb<aeg) ;
		float vaheb = (float) aegb - aeg;
		
		if (vahe > vaheb)
			System.out.println("kahe sportlase kiirusevahe on "+ vahe + "km/h");
		
		else
			System.out.println("kahe sportlase kiirusevahe on "+ vaheb + "km/h");

			
		
	}
		}
    
		

	
	
	
	
	
	
	
	
	
	
	
	
	