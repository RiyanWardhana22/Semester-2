import java.util.Scanner;
public class ArrayNamaMahasiswa {

            String[] namaMahasiswa = new String[30];

            // Konstruktor Start
            public ArrayNamaMahasiswa(String nama_kelas)
            {
                        System.out.println(nama_kelas);
                        isiNama();
                        // Konstruktor Start
            }

            void isiNama()
            {
                        namaMahasiswa[0] =  "Riyan Wardhana";
                        namaMahasiswa[1] =  "Yusuf Kontol";
                        namaMahasiswa[2] =  "Nazwar Anjeng";
                        namaMahasiswa[3] =  "Fikri Ganteng Abiez";
            }

            void cetakNama(int i)
            {
                        System.out.println("Nama = " + namaMahasiswa[i]);
            }

            public static void main(String[] args) {
                        System.out.println("===========================");
                        ArrayNamaMahasiswa array = new ArrayNamaMahasiswa("KELAS PSIK 23 B");
                        // System.out.println("KELAS PSIK 23 B");
                        System.out.println("===========================");
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Masukkan Indeks Nama = ");
                        array.cetakNama(scanner.nextInt());
                        scanner.close();
            }
}