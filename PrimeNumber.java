package week1D2Assignments2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input=13;
        int i;
        boolean flag=false;
        
         for(i=2;i<=6;i++)
         {
        	
         if(input%i==0) {
        	flag=true;
        	
        }
         if(!flag) {
        	 System.out.println("input:13");
        	 System.out.println("Prime Number");
        	}else {	
        	System.out.println("Not a Prime Number");
        	}
         break;
         }
         
	}
}