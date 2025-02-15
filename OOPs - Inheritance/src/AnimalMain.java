public class AnimalMain {
    public static void main(String[] args) {
        //declaration and initialization at the same line
        AnimalInheritance animal = new AnimalInheritance("Generic Animal", "Huge", 400);
        doAnimalThings(animal, "slow");

        AnimalDog dog = new AnimalDog();
        doAnimalThings(dog, "fast");

        AnimalDog yorkie = new AnimalDog("Yorkie", 15);
        doAnimalThings(yorkie, "fast");
        AnimalDog retriever = new AnimalDog("Labrador Retriever", 65, "Floppy", "Swimmer");
        System.out.println(yorkie.toString());
        System.out.println(retriever.toString());
        retriever.makesNoise();
        retriever.move("slow");

        AnimalDog wolf = new AnimalDog("Wolf", 40);
        doAnimalThings(wolf, "fast");

        AnimalFish goldie = new AnimalFish("Goldfish", 0.25, 2, 3);
        doAnimalThings(goldie, "fast");
    }
    public static void doAnimalThings(AnimalInheritance animal, String speed){
        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }
}
