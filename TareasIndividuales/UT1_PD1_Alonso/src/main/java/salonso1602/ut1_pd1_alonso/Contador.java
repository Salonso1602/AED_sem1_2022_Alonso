/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.ut1_pd1_alonso;

public class Contador {
    
    private int MAX_CONT;
    
    private int incremento;
    
    private int contador;
    
    public static void main (String[] args) {
        Contador counter = new Contador(1,1,10);
        counter.mostrarContador();
    }
    
    public Contador(int inc, int inicio, int fin){
        incremento = inc;
        MAX_CONT = fin;
        contador = inicio;
    }
    
    //Imprime la secuencia de numeros entre inicio y fin, sumando el incremento,
    //un numero por linea.
    public void mostrarContador(){
        //con while
        /*
        while (contador <= MAX_CONT){
            System.out.println(contador);
            contador += incremento;
        }
        */
        
        //con do-while
        /*
        do{
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
        */
        
        //con for
        for (int i = contador; i<=MAX_CONT; i+=incremento){
            System.out.println(i);
        }
    }
}
