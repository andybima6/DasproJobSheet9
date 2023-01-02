import java.util.Scanner;
public class TugasDua031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);
        int n031D;
        System.out.println("Masukkan Nilai N : ");
        n031D = andyNugraha031D.nextInt();


            for (int i = 0; i < n031D; i++) {
                for (int jandy031D = n031D; jandy031D - 1 > i; jandy031D--) {
                    System.out.print(" ");
                }
                for (int jandy031D = 1; jandy031D <= i + 1; jandy031D++) {
                    System.out.print(jandy031D);
                }
                System.out.println();
            }
        }
    }





