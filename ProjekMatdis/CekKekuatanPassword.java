import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CekKekuatanPassword {

    public static String cekKekuatanPassword(String password) {
        if (password.length() < 8) {
            return "Password lemah: Terlalu pendek (minimal 8 karakter).";
        }
        if (!password.matches(".*[a-z].*")) {
            return "Password lemah: Tidak mengandung huruf kecil.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Password lemah: Tidak mengandung huruf besar.";
        }
        if (!password.matches(".*\\d.*")) {
            return "Password lemah: Tidak mengandung angka.";
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return "Password lemah: Tidak mengandung karakter spesial.";
        }
        return "Password kuat.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("= PROGRAM MENGECEK KEKUATAN SEBUAH PASSWORD =");
        System.out.println("=============================================");
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        System.out.println(cekKekuatanPassword(password));
        scanner.close();
    }
}
