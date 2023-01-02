import java.util.Scanner;
import java.util.Random;
public class Quiz031D {
    public static void main(String[] args) {
        Random random031D = new Random();
        Scanner andyNugraha031D = new Scanner(System.in);
        char menu031D = 'y';
        int answer031D, number031D;

        do {
            number031D = random031D.nextInt(10) + 1;
            boolean success031D = false;
            do {
                System.out.println("Tebak Angka (1-10): ");
                answer031D = andyNugraha031D.nextInt();
                andyNugraha031D.nextLine();
                if (answer031D > number031D) {
                    System.out.println("Tebakkan anda lebih dari jawaban");
                } else if (answer031D < number031D) {
                    System.out.println("jawaban anda kurang dari jawaban");
                } else {
                    success031D = (answer031D == number031D);
                }
                System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
                menu031D = andyNugraha031D.nextLine().charAt(0);
            }while (!success031D);
        }while (menu031D == 'y' || menu031D == 'Y');
    }
}
