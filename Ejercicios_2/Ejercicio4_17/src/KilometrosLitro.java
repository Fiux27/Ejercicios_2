import java.util.Scanner;

public class KilometrosLitro
{
public void calcularKilometroLitro()
    {

    Scanner entrada = new Scanner( System.in );

    int totalKilometros = 0;
    int totalGasolina = 0;
    int contadorRegistros = 0;

    int cantKilometros;
    int cantGasolina;

    double promedio;

    System.out.print( "Introduzca la cantidad de kilometros conducidos (-1 para cancelar): ");
    cantKilometros = entrada.nextInt();

    while ( cantKilometros != -1)
    {
    System.out.print( "Introduzca la cantidad de gasolina utilizada: ");
    cantGasolina = entrada.nextInt();

    System.out.printf("\nLa cantidad de kilometros por litro para este reabastecimiento es: %.2f Km/Lt.\n\n",
    (double) cantKilometros/cantGasolina );

    totalKilometros += cantKilometros;
    totalGasolina += cantGasolina;
    contadorRegistros++;

    System.out.print( "Introduzca la cantidad de kilometros conducidos (-1 para cancelar): ");
    cantKilometros = entrada.nextInt();
    }

    if ( contadorRegistros != 0 )
    {
    promedio = (double) totalKilometros / totalGasolina;

    System.out.printf( "\nSe realizo un total de %d reabastecimientos, obteniendo un promedio de %.2f Kilometros/Litro.\n",
    contadorRegistros, promedio );
    } else {
    System.out.println( "No se introdujeron registros." );
    }

    }
}