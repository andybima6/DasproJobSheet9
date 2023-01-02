import java.util.Scanner;
public class TugasSatu031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int nilai031D;
        int n = 5;
        System.out.println("Masukkan Nilai N : ");
        nilai031D = andyNugraha031D.nextInt();


        for (int i = 1; i <= nilai031D; i++) {
            for (int j031D = 1; j031D <= nilai031D; j031D++) {
                if (i == 1 || i == nilai031D || j031D == 1 || j031D == nilai031D) {
                    System.out.print(nilai031D);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}