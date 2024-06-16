import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keranjang {
    private Barang[] items;
    private int itemCount;
    private JTextArea displayArea;

    public Keranjang(int capacity) {
        items = new Barang[capacity];
        itemCount = 0;
        createAndShowGUI();
    }

    public void addItem(Barang item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Keranjang Penuh");
        }
    }

    public void displayCart() {
        int total = 0;
        displayArea.setText("");
        for (int i = 0; i < itemCount; i++) {
            items[i].displayDetails();
            displayArea.append("Nama Barang: " + items[i].getItemName() + ", Harga: Rp. " + items[i].getItemPrice() +
                    ", Total Barang: " + items[i].calculateTotalPrice() / items[i].getItemPrice() + ", Total Harga: Rp. " + items[i].calculateTotalPrice() + "\n");
            total += items[i].calculateTotalPrice();
        }
        displayArea.append("\nTotal Harga: Rp. " + total);
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Kasir");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Nama Barang:");
        JTextField nameField = new JTextField();
        JLabel priceLabel = new JLabel("Harga Barang:");
        JTextField priceField = new JTextField();
        JLabel quantityLabel = new JLabel("Total Barang:");
        JTextField quantityField = new JTextField();

        JButton addButton = new JButton("Tambahkan Barang");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int price = Integer.parseInt(priceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                addItem(new Barang(name, price, quantity));
                displayCart();
            }
        });

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(priceLabel);
        panel.add(priceField);
        panel.add(quantityLabel);
        panel.add(quantityField);
        panel.add(addButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Keranjang(10);
    }
}
