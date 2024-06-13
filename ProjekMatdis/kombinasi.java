import java.util.Scanner;

public class kombinasi  {
    // Fungsi untuk menghitung faktorial
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    // Fungsi untuk menghitung kombinasi C(n, k)
    static int combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai n dan k
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan nilai k: ");
        int k = scanner.nextInt();

        // Memeriksa validitas input
        if (n < 0 || k < 0 || k > n) {
            System.out.println("Input tidak valid. Pastikan n >= 0 dan k >= 0 dan k <= n.");
        } else {
            // Menghitung dan mencetak hasil kombinasi
            System.out.println("Kombinasi C(" + n + ", " + k + ") = " + combination(n, k));
        }

        scanner.close();
    }
}
