import java.util.Scanner;
public class Penilaian {
            public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

                        Float absen, tugasKKNI, uts, uas, totalNilai;

                        System.out.println("====================================");
                        System.out.println("= PENILAIAN MAHASISWA ILKOM UNIMED =");
                        System.out.println("====================================");
            
                        System.out.print("Masukkan Nilai Absen = ");
                        absen =  input.nextFloat();
                        System.out.print("Masukkan Nilai Tugas KKNI = ");
                        tugasKKNI =  input.nextFloat();
                        System.out.print("Masukkan Nilai UTS = ");
                        uts =  input.nextFloat();
                        System.out.print("Masukkan Nilai UAS = ");
                        uas =  input.nextFloat();

                        totalNilai = 0.05f * absen + 0.2f * uts + 0.25f * uas + 0.5f * tugasKKNI;

                        System.out.println("====================================");
                        System.out.print("INDEX MAHASISWA ADALAH ");

                        if (totalNilai >= 90) {
                                    System.out.println("A = Sangat Baik");        
                        } else if (totalNilai >= 80 && totalNilai < 89) {
                                    System.out.println("B = Baik");        
                        } else if (totalNilai >= 70 && totalNilai < 79) {
                                    System.out.println("C = Cukup");        
                        }  else{
                                    System.out.println("E = Sangat Kurang");
                     }

                     input.close();
            }

}
