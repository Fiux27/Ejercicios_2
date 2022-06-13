import java.util.Scanner;

public class NumerosMayores

{
Scanner entrada = new Scanner(System.in);
private String mensaje;
private int mayor;
private int segundo;

public NumerosMayores( String cadena)
    {
    mensaje = cadena;
    }

public void Recibe()          
    {
    int numero;
    int contador = 1;

    System.out.printf("\nEscribir numeros para encontrar los 2 mas grandes %s\n", mensaje);

    System.out.printf("\nEscriba por favor el numero %d: ", contador++);
    mayor = entrada.nextInt();          

    System.out.printf("\nEscriba por favor el numero %d: ", contador++);
    segundo = entrada.nextInt();

    if ( segundo > mayor )
    Intercambia(segundo, mayor);

    while ( 10 >= contador)
    {

    System.out.printf("\nEscriba por favor el numero %d: ", contador++);
    numero = entrada.nextInt();

    if ( numero > mayor)
    Intercambia(numero, mayor);

    }

    System.out.printf("\nEl numero mayor es: %d y el siguiente es %d\n", mayor, segundo);

    }

public void Intercambia( int x, int y)
    {
    mayor = x;
    segundo = y;
    }

}
