
public class fibbo {
	class Solution
	{
	    //Function to return list containing first n fibonacci numbers.
	    public static long[] printFibb(int n) 
	    {
	        //Your code here
	       
	        
	        int a = 0,b = 1;
	      
	        for(int i=1;i<n;++i){
	            System.out.println(a+" ");
	            int c;
	            c=a+b;
	            a=b;
	            b=c;
	            
	        }
	    }
	}

}

