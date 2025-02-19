public class ProductMain {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 144");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        ProductPersonalComputer thePC = new ProductPersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        //thePC.getMonitor().drawPixelAt(10, 10, "red");
        //thePC.getMotherboard().loadProgram("Windows OS");
        //thePC.getComputerCase().pressPowerButton();

        //directly accessing the other methods in monitor, motherboard and all without inheriting.
        //this is composition. Inheritance is a relationship, composition HAS a relationship.


        thePC.powerUp();
        //no direct access to the mointor, motherboard, computercase method.
    }
}
