package dua;

public abstract class Parkir {
    private float jamMasuk;
    private float jamKeluar;

    public Parkir(float jamMasuk, float jamKeluar) {
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    public float getJamMasuk() {
        return jamMasuk;
    }

    public float getJamKeluar() {
        return jamKeluar;
    }

    public float getTotalJam() {
        float totalJam = jamKeluar - jamMasuk;
        if (totalJam < 0) {
            totalJam = jamKeluar + 24 - jamMasuk;
        }
        return totalJam;
    }

    public abstract float hitungBiaya();
}
