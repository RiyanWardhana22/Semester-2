import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenghitungUmur extends Person implements PersonInterface {
    public MenghitungUmur(String name, int birthDay, int birthMonth, int birthYear) {
        super(name, birthDay, birthMonth, birthYear);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void displayAge(int currentDay, int currentMonth, int currentYear) {
        int day = currentDay - birthDay;
        int month = currentMonth - birthMonth;
        int year = currentYear - birthYear;

        if (day < 0) {
            month--;
            day += 30; // simplifying days in a month
        }

        if (month < 0) {
            year--;
            month += 12;
        }

        JOptionPane.showMessageDialog(null,
                "Umur Anda: " + year + " Tahun " + month + " Bulan " + day + " Hari",
                "Hasil", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        MenghitungUmur[] students = new MenghitungUmur[1];
        students[0] = new MenghitungUmur("Test User", 15, 6, 2000);

        SwingUtilities.invokeLater(() -> createAndShowGUI(students));
    }

    private static void createAndShowGUI(MenghitungUmur[] students) {
        JFrame frame = new JFrame("Menghitung Umur");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField nameField = new JTextField(20);
        JTextField birthDayField = new JTextField(2);
        JTextField birthMonthField = new JTextField(2);
        JTextField birthYearField = new JTextField(4);
        JTextField currentDayField = new JTextField(2);
        JTextField currentMonthField = new JTextField(2);
        JTextField currentYearField = new JTextField(4);
        JButton calculateButton = new JButton("Hitung Umur");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Nama:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Tgl Lahir (DD):"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(birthDayField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Bln Lahir (MM):"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(birthMonthField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Thn Lahir (YYYY):"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(birthYearField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Tgl Skrg (DD):"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(currentDayField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Bln Skrg (MM):"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(currentMonthField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Thn Skrg (YYYY):"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(currentYearField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(calculateButton, gbc);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int birthDay = Integer.parseInt(birthDayField.getText());
                int birthMonth = Integer.parseInt(birthMonthField.getText());
                int birthYear = Integer.parseInt(birthYearField.getText());
                int currentDay = Integer.parseInt(currentDayField.getText());
                int currentMonth = Integer.parseInt(currentMonthField.getText());
                int currentYear = Integer.parseInt(currentYearField.getText());

                MenghitungUmur student = new MenghitungUmur(name, birthDay, birthMonth, birthYear);
                student.displayAge(currentDay, currentMonth, currentYear);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
