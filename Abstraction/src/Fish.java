public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.print(type + " is lazily swimming");
        }
        else{
            System.out.print("Running for it's life");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.print("Swish ");
        }
        else{
            System.out.print("Splash ");
        }
    }
}
