public class Factoriales

{
public void factorial()
{
    for ( int i = 1; i <= 15; i++ )
{
  
int factor = 1;
int numero = i;

while ( 0 < numero )
{
factor *= numero--;
}

System.out.printf("\nEl factorial de %d es: %d\n", i, factor );

}
}
}