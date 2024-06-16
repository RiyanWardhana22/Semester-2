public class Barang extends Abstrak implements Tampilan {
    private int quantity;

    public Barang(String itemName, int itemPrice, int quantity) {
        super(itemName, itemPrice);
        this.quantity = quantity;
    }

    @Override
    public int calculateTotalPrice() {
        return itemPrice * quantity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Nama Barang: " + itemName + ", Harga: Rp. " + itemPrice + ", Total Barang: " + quantity + ", Total Harga: Rp. " + calculateTotalPrice());
    }
}
