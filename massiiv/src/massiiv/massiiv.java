package massiiv;

public class massiiv {

		
/* järgnev programm on loodud arvudest ühemõõtmelise massiivi loomiseks
 * @Helina Raudsepp
 */

public static void main(String[] args) {
	
	{    
		
		
		
		int[] a=new int[26];
		
		a[0]=12; 
		a[1]=5;  
		a[2]=10;
		a[3]=10;  
		a[4]=28;
		a[5]=17;  
		a[6]=5;
		a[7]=19;  
		a[8]=0;
		a[9]=13;  
		a[10]=0;
		a[11]=22;  
		a[12]=7;
		a[13]=0;  
		a[14]=17;
		a[15]=2;  
		a[16]=24;
		a[17]=1;  
		a[18]=13;
		a[19]=29;  
		a[20]=0;
		a[21]=7;  
		a[22]=16;
		a[23]=8;
		a[24]=7;  
		a[25]=4;
		
		
		System.out.println("ühemõõtmelised elemendid on ");    
		System.out.println(a[0]);    
		System.out.println(a[1]);    
		System.out.println(a[2]);
		System.out.println(a[3]);    
		System.out.println(a[4]);    
		System.out.println(a[5]);
		System.out.println(a[6]);    
		System.out.println(a[7]);    
		System.out.println(a[8]);
		System.out.println(a[9]);    
		System.out.println(a[10]);    
		System.out.println(a[11]);
		System.out.println(a[12]);    
		System.out.println(a[13]);    
		System.out.println(a[14]);   
		System.out.println(a[15]);    
		System.out.println(a[16]);    
		System.out.println(a[17]);    
		System.out.println(a[18]);
		System.out.println(a[19]);    
		System.out.println(a[20]);    
		System.out.println(a[21]); 
		System.out.println(a[22]);    
		System.out.println(a[23]);
		System.out.println(a[24]);    
		
		
		
		
		
		int a1[]= {0,1,2,3,4,5};
		int size=a.length;
		System.out.println("esimese elemendi väärtus on "+a[0]);
		System.out.println("teise elemendi väärtus on  "+a[size-1]);
		
		
		
		
		
		
		String[] arvud = {"12","5","10","10","28","17","5","19","0","13","0","22","7","0","17","2","24","1","13","29","0","7","16","8","7","4","27","8","8","23","26","25","15","2","26","1"};
		int arvudKokku = arvud.length;
		System.out.println("elementide arv massiivis on : "+arvudKokku);
		

		
		
		
		 int[] array = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
	      int sum = 0;
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("massiivi elementide summa on : "+sum);
		
	      
	      
	      
	      
	      double[] arr = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
	        double total = 0;

	        for(int i=0; i<arr.length; i++){
	        	total = total + arr[i];
	        }
	        double average = total / arr.length;
	        System.out.format("arvude keskmine on : %.3f", average);
	      
	}
	}
}
		


 class mitmemootelinemassiiv {  
		public static void main(String[] args) {
			
		
 
			 String[][] arvudb = {{"1","23"},{"2","15"},{"3","29"},{"4","15"},{"5","26"},{"6","17"},{"7","26"},{"8","15"},{"9","28"},{"10","12"},{"11","24"},{"12","16"},{"13","21"},{"14","10"},{"15","10"},{"16","26"},{"17","27"},{"18","19"},{"19","14"},{"20","14"},{"21","14"},{"22","26"},{"23","20"},{"24","28"},{"25","29"},{"26","11"},{"27","28"},{"28","19"},{"29","25"},{"30","12"}};
			 System.out.println(arvudb[1]);
			 }
			 
		 {
			 }
		{
		}
 }