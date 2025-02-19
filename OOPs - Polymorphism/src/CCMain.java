//composition.

public class CCMain {

    public static void main(String[] args) {
        CCSmartKitchen myKitchen = new CCSmartKitchen();
        myKitchen.setKitchenWork(true, true, true);
        myKitchen.doKitchenWork();
    }
}
