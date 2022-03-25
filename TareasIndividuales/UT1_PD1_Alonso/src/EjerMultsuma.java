package ut1_pd1_alonso.src;

/*
 Ejercicio 1:
    "No, yo pac.\n
    Vos Zacata pac.\n
    Yo pac.\n
 
 Ejercicio 2:
    a) - sipo ("traqueteo", 13);
    b) 
    public class Zumbido {                                      Orden:

        public static void desconcertar (String dirigible) {
            System.out.println (dirigible);                         6
            sipo ("ping", -5);                                      7
        }

        public static void sipo (String membrillo, int flag) {
            if (flag < 0) {                                         2, 8
                System.out.println (membrillo + " sup");            9
            } else {                                                3
                System.out.println ("ik");                          4
                desconcertar (membrillo);                           5
                System.out.println ("muaa-ja-ja-ja");               10
              }
        }

        public static void main (String[] args) {
                sipo ("traqueteo", 13);                             1
        }
    }

 */
public class EjerMultsuma {

    public static void main(String[] args) {
        Multsuma(1.0,2.0,3.0);
    }
    
    //Ejercicio 3
    public static void Multsuma(double a, double b, double c){
        System.out.println(a*b+c);
    }
}
