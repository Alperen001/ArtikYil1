import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;
		Scanner inp = new Scanner(System.in);
		System.out.println("Do�um Y�l�n�z� Giriniz");
		yil = inp.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print(yil + " Art�k bir y�ld�r!");
            } else {
                System.out.print(yil + " Art�k bir y�l de�ildir.");
            }
        } else if (yil % 4 == 0) {
            System.out.print(yil + " Art�k bir y�ld�r!");
        } else {
            System.out.print(yil + " Art�k bir y�l de�ildir.");
        }
	}

}
