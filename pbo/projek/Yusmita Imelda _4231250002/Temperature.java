import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Temperature extends TemperatureConverter implements Convertible {

    public Temperature(double temperature) {
        super(temperature);
    }

    @Override
    public double toCelsius() {
        return temperature;
    }

    @Override
    public double toFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

    @Override
    public double toKelvin() {
        return temperature + 273.15;
    }

    @Override
    public double toReaumur() {
        return temperature * 4 / 5;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Konversi Temperatur");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        frame.add(panel);
        
        placeComponents(panel, gbc);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel, GridBagConstraints gbc) {
        gbc.insets = new Insets(5, 5, 5, 5);
        
        JLabel tempLabel = new JLabel("Temperatur:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(tempLabel, gbc);

        JTextField tempText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(tempText, gbc);

        JLabel unitLabel = new JLabel("Pilihan:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(unitLabel, gbc);

        String[] options = {"Celsius", "Fahrenheit", "Kelvin", "Reaumur"};
        JComboBox<String> tempOptions = new JComboBox<>(options);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(tempOptions, gbc);

        JButton convertButton = new JButton("Konversi");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(convertButton, gbc);

        JLabel resultLabel = new JLabel("Hasil:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        panel.add(resultLabel, gbc);

        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(scrollPane, gbc);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperature = Double.parseDouble(tempText.getText());
                    String selectedOption = (String) tempOptions.getSelectedItem();

                    Temperature temp = new Temperature(temperature);
                    StringBuilder sb = new StringBuilder();

                    double[] temperatures = {temperature};
                    for (double tempVal : temperatures) {
                        temp = new Temperature(tempVal);
                        switch (selectedOption) {
                            case "Celsius":
                                sb.append("Celsius: ").append(temp.toCelsius()).append(" °C\n");
                                sb.append("Fahrenheit: ").append(temp.toFahrenheit()).append(" °F\n");
                                sb.append("Kelvin: ").append(temp.toKelvin()).append(" K\n");
                                sb.append("Reaumur: ").append(temp.toReaumur()).append(" °Ré\n");
                                break;
                            case "Fahrenheit":
                                temp = new Temperature((tempVal - 32) * 5 / 9);
                                sb.append("Celsius: ").append(temp.toCelsius()).append(" °C\n");
                                sb.append("Fahrenheit: ").append(tempVal).append(" °F\n");
                                sb.append("Kelvin: ").append(temp.toKelvin()).append(" K\n");
                                sb.append("Reaumur: ").append(temp.toReaumur()).append(" °Ré\n");
                                break;
                            case "Kelvin":
                                temp = new Temperature(tempVal - 273.15);
                                sb.append("Celsius: ").append(temp.toCelsius()).append(" °C\n");
                                sb.append("Fahrenheit: ").append(temp.toFahrenheit()).append(" °F\n");
                                sb.append("Kelvin: ").append(tempVal).append(" K\n");
                                sb.append("Reaumur: ").append(temp.toReaumur()).append(" °Ré\n");
                                break;
                            case "Reaumur":
                                temp = new Temperature(tempVal * 5 / 4);
                                sb.append("Celsius: ").append(temp.toCelsius()).append(" °C\n");
                                sb.append("Fahrenheit: ").append(temp.toFahrenheit()).append(" °F\n");
                                sb.append("Kelvin: ").append(temp.toKelvin()).append(" K\n");
                                sb.append("Reaumur: ").append(tempVal).append(" °Ré\n");
                                break;
                        }
                    }
                    resultArea.setText(sb.toString());
                } catch (NumberFormatException ex) {
                    resultArea.setText("Kesalahan Input");
                }
            }
        });
    }
}
