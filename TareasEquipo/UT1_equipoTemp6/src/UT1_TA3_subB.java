package UT1_equipoTemp6.src;

public class UT1_TA3_subB {
    
    public static void ejercicioB(){
        long n = 4;
        int sumando = 0;
        int resultado = 0;
     
        if (UtilMath.isPrime(n))
        {
            do {
                resultado += sumando;
                sumando += 2;
            }while(sumando <= n);
        }
        else
        {
            sumando++;
            do {
                resultado += sumando;
                sumando += 2;
            }while(sumando <= n);
        }
        System.out.println(resultado);
    }
}
