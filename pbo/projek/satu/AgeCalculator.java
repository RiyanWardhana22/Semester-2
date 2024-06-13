package satu;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgeCalculator extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public AgeCalculator() {
        setTitle("Age Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label = new JLabel("Masukkan Tanggal Lahir Kamu (Tahun-Bulan-Tanggal):");
        inputField = new JTextField();
        JButton calculateButton = new JButton("Kalkulasi Umur");
        resultLabel = new JLabel("Your age will be displayed here.");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAge();
            }
        });

        panel.add(label);
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel, BorderLayout.CENTER);
    }

    private void calculateAge() {
        String input = inputField.getText();
        if (DateValidator.isValid(input)) {
            try {
                LocalDate birthDate = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);
                LocalDate currentDate = LocalDate.now();
                if (birthDate.isAfter(currentDate)) {
                    resultLabel.setText("Birthdate is in the future. Please enter a valid date.");
                } else {
                    Period age = Period.between(birthDate, currentDate);
                    resultLabel.setText("You are " + age.getYears() + " years old.");
                }
            } catch (DateTimeParseException e) {
                resultLabel.setText("Invalid date format. Please use yyyy-MM-dd.");
            }
        } else {
            resultLabel.setText("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
