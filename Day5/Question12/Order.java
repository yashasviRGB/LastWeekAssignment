package Day5.Question12;

public class Order {
    private MenuItem[] menuarray = new MenuItem[10];
    private int itemCount = 0;

    public String addMenuItem(MenuItem item){

        if(item == null) return "Item is null";
        if (itemCount < 10) {
            menuarray[itemCount] = item;
            itemCount++;
            return "Added successfully";

        } else {
            System.out.println("Order is full");
            return "Order is full";
        }
        
    }

    public int calculateTotal(){

        int total = 0;
        for(int i = 0; i< itemCount; i++){
            total += menuarray[i].getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(menuarray[i].getName() + " - Rs" + menuarray[i].getPrice());
        }
        System.out.println("Total: Rs" + calculateTotal());
    }
}
