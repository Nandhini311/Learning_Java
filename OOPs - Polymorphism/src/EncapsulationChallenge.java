public class EncapsulationChallenge {
    public static void main(String[] args) {
        EncapsulationPrinter printer = new EncapsulationPrinter(20, 11, true);
        printer.printPages(20);
        System.out.println(printer.getPagesPrinted());
    }
}
