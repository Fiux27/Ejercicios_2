public class TernaPitagorica {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		int c = 4;
		
		System.out.printf("%s%n%s%n", "Aplicacion que muestra en una tabla las ternas pitagoricas",
									  "para lado1, lado2 y la hipotenusa, menores a 500");
		System.out.printf("%n%18s", "T E R N A");
		System.out.printf("%n%5s%10s%15s%n", "lado1", "lado2", "hipotenusa");
		
		for(int lado1 = 1; lado1 < 500; lado1++) {
			
			for(int lado2 = 1; lado2 < 500; lado2++) {
				
				double scl = Math.pow(lado1, 2) + Math.pow(lado2, 2);
				
				for(int hipot = 1; hipot < 500; hipot++) {
					
					if(scl == hipot)
						System.out.printf("%n%s%10s%15s", lado1, lado2, hipot);
				}
			}
		}
	}
}