


class Fibonacci { 
    static int recursivefib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return recursivefib(n - 1) + recursivefib(n - 2); 
    } 
   static int iterativefib(int n) 
    { 
    
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
    
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
      
        f[i] = f[i-1] + f[i-2]; 
    } 
       
    return f[n]; 
    } 
  
    public static void main(String args[]) 
    { 
    	
        int a[]={5,10,15,20},rf,itf;
        long startTime,endTime,totalTime;
        for(int r=0;r<4;r++)
        { 
             startTime = System.nanoTime();
             rf=recursivefib(a[r]);
             endTime   = System.nanoTime();
             totalTime = endTime - startTime;
             System.out.println(a[r]+"th fibonacci term using recusion is "+rf+"and excution time is "+totalTime);
             startTime = System.nanoTime();
             itf=iterativefib(a[r]);
             endTime   = System.nanoTime();
             totalTime = endTime - startTime;
             System.out.println(a[r]+"th fibonacci term using iteration is "+itf+"and excution time is "+totalTime);
          

        } 
    
    } 
} 
