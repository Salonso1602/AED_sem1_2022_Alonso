package UT1_equipoTemp6.src;

public class UtilMath {
    
    public static boolean isPrime(long n){
        if (n == 1 || n == 0 || n < 0){
            return false;
        }
        
        int i = 2;
        while (i<n){
            if (n%i == 0){
                return false;
            }
            i++;
        }
        
        return true;
    }
    
    public static int factorial(int num){
        if(num >= 0){
            int fact=1;
            for(int i = 1; i<=num ; i++){
                fact *=i;
            }
            return fact;
        }
        return 0;
    }
} 
