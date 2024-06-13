import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan namanya
        System.out.print("Masukkan nama Anda: ");
        
        // Membaca input dari pengguna
        String nama = scanner.nextLine();
        
        // Menampilkan pesan salam dengan nama yang dimasukkan pengguna
        System.out.println("Hello, " + nama + "!");
        
        // Menutup objek Scanner setelah selesai digunakan
        scanner.close();
    }
}
