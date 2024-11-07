import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;

        // Deklarasi array untuk penonton (4 baris x 2 kolom)
        String[][] penonton = new String[4][2];

        // Menu dengan do-while untuk menjalankan menu hingga opsi 3 dipilih
        String pilihan;
        do {
            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilihan = sc.nextLine(); // Membaca pilihan menu sebagai string

            switch (pilihan) {
                case "1":
                    // Input data penonton
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    
                    // Validasi input baris dan kolom
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); // Membersihkan newline karakter setelah input angka

                        // Menyimpan nama penonton di array jika input valid
                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            // Pengecekan apakah kursi sudah terisi
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Penonton berhasil ditambahkan!");
                                validInput = true; // Menghentikan loop jika input valid
                            } else {
                                // Jika kursi sudah terisi
                                System.out.println("Kursi sudah terisi, pilih kursi lain.");
                            }
                        } else {
                            // Jika input baris atau kolom tidak valid
                            System.out.println("Input tidak valid! Baris harus antara 1-4 dan kolom antara 1-2. Coba lagi.");
                        }
                    }
                    break;

                case "2":
                    // Menampilkan daftar penonton
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case "3":
                    // Keluar dari program
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;

                default:
                    // Menangani input yang tidak valid
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (!pilihan.equals("3")); // Program akan terus berjalan sampai pilihan adalah "3"
    }
}
