import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;
		Scanner inp = new Scanner(System.in);
		System.out.println("Doðum Yýlýnýzý Giriniz");
		yil = inp.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print(yil + " Artýk bir yýldýr!");
            } else {
                System.out.print(yil + " Artýk bir yýl deðildir.");
            }
        } else if (yil % 4 == 0) {
            System.out.print(yil + " Artýk bir yýldýr!");
        } else {
            System.out.print(yil + " Artýk bir yýl deðildir.");
        }
	}

}
