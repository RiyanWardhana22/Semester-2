print("====================================")
print("= PENILAIAN MAHASISWA ILKOM UNIMED =")
print("====================================")

absen = float(input("Masukkan Nilai Absen = "))
uts = float(input("Masukkan Nilai UTS = "))
uas = float(input("Masukkan Nilai UAS = "))
tugasKKNI = float(input("Masukkan Nilai Tugas KKNI = "))

totalNilai = 0.2 * absen + 0.2 * uts + 0.25 * uas + 0.5 * tugasKKNI

print("=======================")
print("INDEX MAHASISWA ADALAH")

if totalNilai >= 90:
            print("A = Sangat Kompeten")
elif totalNilai >= 80 and totalNilai < 89:
            print("B = Kompeten")
elif totalNilai >= 70 and totalNilai < 79:
        print("C =  Cukup Kompeten")
else:
        print("E = Tidak Kompeten")