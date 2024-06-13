import java.util.Scanner;
public class ytta3 {
            public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

                        int nilaiUjian;
                        
                        System.out.println("=======================");
                        System.out.println("= PENILAIAN MAHASISWA =");
                        System.out.println("=======================");

                        System.out.print("Masukkan Nilai Ujian Mahasiswa = ");
                        nilaiUjian = input.nextInt();                      

                        switch (nilaiUjian) {
                                    case 90:
                                            System.out.println("A : Sangat Baik");    
                                            System.out.println("Kategori : Lulus");    
                                                break;
                                   default: 
                                                System.out.println("Angka Tidak Diketahui atau anda tidak lulus");
                        }
                        System.out.println("===========================");
                        System.out.println("= Nama : Riyan Wardhana   =");
                        System.out.println("= NIM  : 4233550008       =");
                        input.close();
            }
}


// PEMBATAS

// import java.util.Scanner;

// public class ytta3 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         float nilaiUjian;

//         System.out.println("=======================");
//         System.out.println("= PENILAIAN MAHASISWA =");
//         System.out.println("=======================");

//         System.out.print("Masukkan Nilai Ujian Mahasiswa = ");
//         nilaiUjian = input.nextFloat();

//         if (nilaiUjian >= 90) {
//             System.out.println("A : Sangat Baik");
//             System.out.println("Kategori : Lulus");
//         } else {
//             System.out.println("Angka Tidak Diketahui atau Anda tidak lulus");
//         }

//             System.out.println("===========================");
//             System.out.println("= Nama : Riyan Wardhana   =");
//             System.out.println("= NIM  : 4233550008       =");

//         input.close();
//     }
// }
