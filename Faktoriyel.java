import java.util.Scanner;

public class Faktoriyel {

	static int fonksiyon(int sayi) {

		int faktor = 1;
		for (int i = 1; i <= sayi; i++) {
			faktor = faktor * i;
		}

		return faktor;

	}

	public static void main(String[] args) {
		

		int sayi, faktoriyel;

		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Faktöriyel almak için sayý giriniz(Çýkmak için -1 giriniz):");
			sayi = input.nextInt();

			if (sayi != -1) {

				faktoriyel = fonksiyon(sayi);
				System.out.println(sayi + "!=" + faktoriyel);
			}
		} while (sayi != -1);
		System.out.println("Güle güle...");

	}
}