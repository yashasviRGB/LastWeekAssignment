package Day5.Question12;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Burger", 120);
        MenuItem item2 = new MenuItem("Pizza", 250);
        MenuItem item3 = new MenuItem("Coke", 60);

        Order order = new Order();
        order.addMenuItem(item1);
        order.addMenuItem(item2);
        order.addMenuItem(item3);

        order.printReceipt();
    }
}
