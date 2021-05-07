public class Ticket {

    private double price;
    private boolean isVip;

    Ticket(boolean isVip, double price) {
        this.price = price;
        this.isVip = isVip;
    }

    public Ticket() {
    }

    double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "isVip: " + isVip +
                ", price: " + price +
                '}';
    }
}
