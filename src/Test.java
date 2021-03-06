import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {

		Scanner unos = new Scanner(System.in);

		BibliotekaRadnje b = new BibliotekaRadnje();

		int opcija = 1;
		int brojRacuna, brojKnjige;

		while (opcija != 0) {

			System.out.println();
			System.out.println("Izaberite jednu od opcija: ");
			System.out.println(
					"1. Kreiraj racun\n2. Kreiraj knjigu\n3. Podigni knjigu\n4. Vrati knjigu\n5. Ispis racuna\n6. Ispis knjia\n0. Izlaz");

			try {

				opcija = unos.nextInt();

				if (opcija == 1) {

					System.out.println("Unesite broj racuna: ");
					brojRacuna = unos.nextInt();

					unos.nextLine();

					System.out.println("Unesite ime korisnika");
					String ime = unos.nextLine();

					b.kreirajRacun(brojRacuna, ime);

				}
				if (opcija == 2) {

					System.out.println("Unesite broj knjige: ");
					brojKnjige = unos.nextInt();

					unos.nextLine();

					System.out.println("Unesite ime knjige: ");
					String imeKnjige = unos.nextLine();

					b.kreirajKnjigu(brojKnjige, imeKnjige);

				}

				if (opcija == 3) {

					System.out.println("Unesite broj racuna: ");
					brojRacuna = unos.nextInt();

					unos.nextLine();

					System.out.println("Unesite broj knjige");
					brojKnjige = unos.nextInt();

					b.podigniKnjigu(brojRacuna, brojKnjige);

				}

				if (opcija == 4) {

					boolean uspjesno = true;

					while (uspjesno)
						try {
							System.out.println("Unesite broj racuna: ");
							brojRacuna = unos.nextInt();

							unos.nextLine();

							System.out.println("Unesite broj knjige");
							brojKnjige = unos.nextInt();

							b.vratiKnjigu(brojRacuna, brojKnjige);

							uspjesno = true;

						} catch (InputMismatchException ex) {

							System.out.println("Pogresan unos: ");
							uspjesno = false;

							unos.nextLine();
						}
				}

				if (opcija == 5) {
					System.out.println("Detalji o postojecim racunima: ");
					b.ispisDetaljaORacunima();

				}

				if (opcija == 6) {
					System.out.println("Detalji o postojeŠim knjigama: ");
					b.ispisDetaljaOKnjigama();

				}

				if (opcija == 0) {

					System.exit(0);
				}

			} catch (InputMismatchException ex) {

				System.out.println("Pogresan unos ");

				unos.nextLine();

			} catch (IllegalArgumentException ex) {

				System.out.println("2: ");

				unos.nextLine();
			}
		}
		unos.close();
	}

}
