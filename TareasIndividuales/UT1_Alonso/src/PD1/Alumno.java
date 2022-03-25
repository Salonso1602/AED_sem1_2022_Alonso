package ut1_alonso.src;

/*
    a) El error al ejecutar el archivo yace en el constructor de instancias de 
alumno, que asigna al atributo nombre un valor null. Al intentar concatenar al 
string nulo un simbolo, el sistema devuelve una excepción.

    b) El error que devuelve el metodo "recorrer" es de IndexOutOfBound, que se 
provoca cuando se trata de acceder a un caracter de un string por su indice, 
pero este indice pasa el largo de la cadena. En el caso actual el problema yace
que mientras que .length devuelve el largo de la cadena, los indices de la
string empiezan en 0, por lo que cuando i llega al ultimo valor de length, este
se pasa.

    c) El metodo getValor tiene un problema similar, ya que los vectores 
comienzan en el indice 0, si se quiere obtener el octavo valor de un array
debemos usar el indice 7.

    d) El metodo getPrimerCaracter debería retornar el primer caracter de un
string, para esto crea un array de strings y al primero de estos retorna su 
primer caracter. El error esta en que el array no es inicializado, por lo que 
sus elementos inicias en el valor predeterminado, qu para string es Null, esto
causa una excepción con el metodo charAt(). A su vez si se quiere el primer 
caracter, debemos pedir al charAt el caracter de indice 0.

    e) El metodo paraAString tira error de casteo de Integer(un tipo de Objeto 
con metodos propios, a diferencia de los tipos primitivos como int) ya que no 
se puede transformar a string.
 */
public class Alumno {

    public static void main (String[] args) {
        Alumno alumno = new Alumno("Messi");
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(recorrer(alumno.getNombreAdmiracion()));
        System.out.println(getValor());
        System.out.println(getPrimerCaracter(alumno.getNombreAdmiracion()));
        System.out.println(paraAString(7));
    }
    
    private String nombre;

    //a)Para arreglar la escepcion del nombre null, le pasamos por constructor
    //  un nombre en string para asignar al atributo
    public Alumno (String name) {
        nombre = name;
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static int recorrer (String cadena) {
        int res = 0;
        //b) Para arreglarlo modificamos la inicialización y terminación del
        //for, para que i recorra el indice 0 y no llegue hasta el valor del
        //largo, sino 1 menos.
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        //c) Para arreglarlo, recuperamos el valor de indice 7.
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        //d) Para arreglarlo deseche el array y saco el primer caractér desde
        //el string ingresado directamente.
        return (palabra.charAt(0));
    }
    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        //e) Para arreglarlo usamos el metodo de integer que devuelve un string
        //a partir del valor almacenado dentro de la instancia.
        return x1.toString() ;
    }
}

