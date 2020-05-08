import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int c, r, e;
		char sexo;
		double cerveja, refri, espeto, couvert, ingresso, consumo, total;
		
		// LEITURA
		
		System.out.printf("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas: ");
		c = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		r = sc.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		e = sc.nextInt();
		
		// CALCULO
		
		if(sexo == 'F' || sexo == 'f' ) {
			ingresso = 8.00;
		}else {
			ingresso = 10.00;
		}
		cerveja = c * 5.00;
		refri = r * 3.00;
		espeto = e * 7.00;
		consumo = cerveja + refri + espeto;
		if (consumo < 30.00){
			couvert = 4.00;
		}else {
			couvert = 0.00;
		}
		total = consumo + ingresso + couvert;
				
		// EXIBIÇÃO
				
		System.out.printf("%nRELATÓRIO:%n");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if(couvert == 4.00){	
			System.out.printf("Couvert = R$ %.2f%n", couvert);
		}else {
			System.out.printf("Isento de Couvert%n");
		}
		System.out.printf("Ingresso = R$ %.2f%n%n", ingresso);	
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		sc.close();
	}

}
