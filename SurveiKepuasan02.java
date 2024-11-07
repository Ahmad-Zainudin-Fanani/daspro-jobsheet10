import java.util.Scanner;

public class SurveiKepuasan02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array 2 dimensi untuk menyimpan hasil survei
        int[][] hasilSurvei = new int[10][6];
        
        // a. Menyimpan hasil survey
        System.out.println("Masukkan hasil survei untuk 10 responden dan 6 pertanyaan (nilai 1-5):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRataResponden = total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalKeseluruhan = 0;
        int jumlahData = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
                jumlahData++;
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / jumlahData;
        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}