public class EncapsulationPrinter {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public EncapsulationPrinter(int tonerLevel, int pagesPrinted, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        tonerLevel = tonerLevel > 100? -1: tonerLevel;
        tonerLevel = tonerLevel < 0? -1: tonerLevel;
        return tonerLevel;
    }

    public int printPages(int pagesToBePrinted){
        int jobPages = (duplex)? (pagesToBePrinted/2)+ (pagesToBePrinted%2): pagesToBePrinted;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

