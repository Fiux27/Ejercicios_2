import java.util.Scanner;

public class Ventas 
{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int prod;
		int qty1 = 0;
		int qty2 = 0;
		int qty3 = 0;
		int qty4 = 0;
		int qty5 = 0;
		
		System.out.println("Aplicacion que calcula las ventas de un vendedor de una serie de productos");
		
		System.out.printf("%n%s%10s%n%4s%14s%n%4s%14s%n%4s%14s%n%4s%14s%n%4s%14s%n", 
							"Producto", "Precio",
							"1", "$2.98",
							"2", "$4.50",
							"3", "$9.98",
							"4", "$4.49",
							"5", "$6.87");
		
		while(true) {
			
			System.out.println("Ingrese el numero de producto (0 para terminar)");
			System.out.print("----> ");
			prod = input.nextInt();
			
			if(prod != 0) {
				
				if(prod > 0 && prod < 6) {
					
					switch(prod){
						
					case 1:
						System.out.println("Ingrese la cantidad vendida:");
						qty1 += input.nextInt();
						break;
						
					case 2:
						System.out.println("Ingrese la cantidad vendida:");
						qty2 += input.nextInt();
						break;
						
					case 3:
						System.out.println("Ingrese la cantidad vendida:");
						qty3 += input.nextInt();
						break;
						
					case 4:
						System.out.println("Ingrese la cantidad vendida:");
						qty4 += input.nextInt();
						break;
						
					case 5:
						System.out.println("Ingrese la cantidad vendida:");
						qty5 += input.nextInt();
						break;
						
					}
					
				}
				else {
					System.out.println("VALOR INCORRECTO");
				}
				
			}
			else {
				System.out.println("CILO TERMINADO");
				break;
			}
			
		}
		
		System.out.printf("%n%s%n%s%10s%10s%n%4s%10s%10s%.2f%n%4s%10s%10s%.2f%n%4s%10s%10s%.2f%n"
						+ "%4s%10s%10s%.2f%n%4s%10s%10s%.2f%n",
						  "	REPORTE DE VENTAS",
						  "Producto", "Cantidad", "Ventas",
						  "1", qty1, "$", qty1 * 2.98,
						  "2", qty2, "$", qty2 * 4.50,
						  "3", qty3, "$", qty3 * 9.98,
						  "4", qty4, "$", qty4 * 4.49,
						  "5", qty5, "$", qty5 * 6.87);
		
	}

}