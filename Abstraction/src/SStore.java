import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

record OrderItem(int qty, ProductForSale product) {
}

public class SStore {
    public static ArrayList<ProductForSale> products = new ArrayList<>();

//    public static void ListOrderItem(ArrayList<OrderItem> orderList){
//        for(var i: orderList) {
//            System.out.println(i.product().type + ": " + i.product().getSalesPrices(i.qty()) );
//        }
//    }

    public static void addOrderItem(ArrayList<OrderItem> orderList, int orderIndex, int qty){
        orderList.add(new OrderItem(qty, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item: order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrices(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }

    public static void main(String[] args) {


        products.add(new PMakeUp("Blush", 80, "To make your cute cheeks pink"));
        products.add(new PMakeUp("Eyeliner", 40, "To make those beautiful eyes defined"));
        products.add(new PToys("Barbie", 100, "Barbie toy is a fashion doll brand created by Mattel"));
        products.add(new PToys("Bulldozer", 50, "miniature replica of a real bulldozer, designed for children’s play or as a collectible model"));



        System.out.println("_".repeat(30));


        Scanner sc = new Scanner(System.in);
        String CustomerName = sc.next();
        ArrayList<OrderItem> order_1 = new ArrayList<>();
        addOrderItem(order_1, 0, 1);
        addOrderItem(order_1, 3, 2);
        addOrderItem(order_1, 2, 3);
        addOrderItem(order_1, 1, 1);

        //order_1.add(new OrderItem(1, products.get(0))); //function addOrderItem does the same thing.
        //order_1.add(new OrderItem(2, products.get(3)));
        //order_1.add(new OrderItem(2, products.get(1)));

        //ListOrderItem(order_1);
        System.out.println("This bill of Customer:" + CustomerName);
        printOrder(order_1);

    }
}
