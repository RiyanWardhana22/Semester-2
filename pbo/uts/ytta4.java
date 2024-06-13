import java.util.Scanner;
public class ytta4 {
            public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

                        String nama;
                        int honor, lembur, totalHonor;
                        char ulang;

                        do {
                        System.out.println("===========================");
                        System.out.println("= Nama : Riyan Wardhana   =");
                        System.out.println("= NIM  : 4233550008       =");
                        System.out.println("===========================");
                        
                        System.out.print("Masukkan Nama = ");
                        nama = input.next();

                        System.out.print("Masukkan Honor = ");
                        honor = input.nextInt();
                        
                        System.out.print("Masukkan Lembur = ");
                        lembur = input.nextInt();

                        totalHonor = honor + lembur;

                        System.out.println("Total Honor = " + totalHonor);

                        System.out.print("Apakah Anda Ingin Berhenti ? (Y/T) = ");
                        ulang = input.next().charAt(0);
                        } 
                        while (ulang != 'Y' && ulang != 'y');

                        
                        
                        input.close();
            }
}
