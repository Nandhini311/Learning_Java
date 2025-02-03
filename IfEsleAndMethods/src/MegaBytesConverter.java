public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(4000);
    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes){

            if (kiloBytes < 0){
                System.out.print("Invalid Value");
            }
            else {
                int MegaBytes = kiloBytes / 1024;
                int newRemaindingKiloBytes = kiloBytes % 1024;
                System.out.print(kiloBytes + " KB = " + MegaBytes + " MB and " + newRemaindingKiloBytes + " KB");
            }

        }
    }

