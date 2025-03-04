import java.util.ArrayList;
import java.util.LinkedList;

record OrderItem(int qty, ProductForSale product) {
}

public class SStore {
    public static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void ListOrderItem(ArrayList<OrderItem> orderList){
        for(var i: orderList) {
            System.out.println(i.product().type + ": " + i.product().getSalesPrices(i.qty()) );
        }
    }

    public void addOrderItem(ArrayList<OrderItem> orderList){

    }

    public static void main(String[] args) {
        products.add(new PMakeUp("Blush", 80, "To make your cute cheeks pink"));
        products.add(new PMakeUp("Eyeliner", 40, "To make those beautiful eyes defined"));
        products.add(new PToys("Barbie", 100, "Barbie toy is a fashion doll brand created by Mattel"));
        products.add(new PToys("Bulldozer", 50, "miniature replica of a real bulldozer, designed for children’s play or as a collectible model"));

        ArrayList<OrderItem> order_1 = new ArrayList<>();
        order_1.add(new OrderItem(1, products.get(0)));
        order_1.add(new OrderItem(2, products.get(3)));
        order_1.add(new OrderItem(2, products.get(1)));

        ListOrderItem(order_1);

    }
}
