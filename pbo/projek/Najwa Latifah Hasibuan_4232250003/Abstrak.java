public abstract class Abstrak {
            protected String itemName;
            protected int itemPrice;
        
            public Abstrak(String itemName, int itemPrice) {
                this.itemName = itemName;
                this.itemPrice = itemPrice;
            }
        
            public abstract int calculateTotalPrice();
        
            public String getItemName() {
                return itemName;
            }
        
            public int getItemPrice() {
                return itemPrice;
            }
        }
        