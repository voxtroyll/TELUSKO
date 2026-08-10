enum Biscuits {
    MarieGold(10),
    HappyHappy,
    Oreo(50),
    JimJam(25);

    private int price;

    private Biscuits(int price) {
        this.price = price;
    }

    private Biscuits() {
        this.price = 200;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class private_methods_withEnums {

    public static void main(String[] args) {

        for (Biscuits biscuit : Biscuits.values()) {


            //biscuit.setPrice(200);  -> set the price of all items at once
            Biscuits.JimJam.setPrice(500); //->sets the price of single item
            System.out.println(biscuit + " : ₹" + biscuit.getPrice());
        }
    }
}