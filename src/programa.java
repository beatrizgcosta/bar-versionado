import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int c, r, e;
		char sexo;
		
		// LEITURA
		
		System.out.printf("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas: ");
		c = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		r = sc.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		e = sc.nextInt();
	}

}
