package dua;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainApp extends JFrame implements TarifParkir {
    private JTextField jamMasukField;
    private JTextField jamKeluarField;
    private JTextArea displayArea;
    private JButton hitungButton;
    private JComboBox<String> kendaraanBox;
    private ArrayList<Parkir> parkirList;

    public MainApp() {
        parkirList = new ArrayList<>();

        setTitle("Tarif Parkir");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel kendaraanLabel = new JLabel("Jenis Kendaraan:");
        kendaraanLabel.setBounds(20, 20, 150, 25);
        add(kendaraanLabel);

        String[] jenisKendaraan = {"Mobil", "Motor"};
        kendaraanBox = new JComboBox<>(jenisKendaraan);
        kendaraanBox.setBounds(150, 20, 160, 25);
        add(kendaraanBox);

        JLabel jamMasukLabel = new JLabel("Jam Masuk (24 Jam):");
        jamMasukLabel.setBounds(20, 60, 150, 25);
        add(jamMasukLabel);

        jamMasukField = new JTextField();
        jamMasukField.setBounds(150, 60, 160, 25);
        add(jamMasukField);

        JLabel jamKeluarLabel = new JLabel("Jam Keluar (24 Jam):");
        jamKeluarLabel.setBounds(20, 100, 150, 25);
        add(jamKeluarLabel);

        jamKeluarField = new JTextField();
        jamKeluarField.setBounds(150, 100, 160, 25);
        add(jamKeluarField);

        hitungButton = new JButton("Hitung Biaya");
        hitungButton.setBounds(150, 140, 160, 25);
        add(hitungButton);

        displayArea = new JTextArea();
        displayArea.setBounds(20, 180, 340, 60);
        add(displayArea);

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungBiayaParkir();
            }
        });
    }

    public void hitungBiayaParkir() {
        float jamMasuk = Float.parseFloat(jamMasukField.getText());
        float jamKeluar = Float.parseFloat(jamKeluarField.getText());
        String jenisKendaraan = (String) kendaraanBox.getSelectedItem();

        Parkir parkir = null;
        if ("Mobil".equals(jenisKendaraan)) {
            parkir = new Mobil(jamMasuk, jamKeluar);
        } else if ("Motor".equals(jenisKendaraan)) {
            parkir = new Motor(jamMasuk, jamKeluar);
        }

        if (parkir != null) {
            parkirList.add(parkir);
            displayParkirList();
        }
    }

    public void displayParkirList() {
        displayArea.setText("");
        for (Parkir parkir : parkirList) {
            displayArea.append("Jenis: " + (parkir instanceof Mobil ? "Mobil" : "Motor")
                    + ", Total Jam: " + parkir.getTotalJam()
                    + ", Biaya: Rp " + parkir.hitungBiaya() + "\n");
        }
    }

    @Override
    public float hitungBiaya() {
        return 0;
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.setVisible(true);
    }
}

class Mobil extends Parkir {
    public Mobil(float jamMasuk, float jamKeluar) {
        super(jamMasuk, jamKeluar);
    }

    @Override
    public float hitungBiaya() {
        return getTotalJam() * TarifParkir.tarifMobil;
    }
}

class Motor extends Parkir {
    public Motor(float jamMasuk, float jamKeluar) {
        super(jamMasuk, jamKeluar);
    }

    @Override
    public float hitungBiaya() {
        return getTotalJam() * TarifParkir.tarifMotor;
    }
}
