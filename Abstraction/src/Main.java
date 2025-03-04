import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //cannot instantiate absAnimal as its abstract
        Dog dog = new Dog("Wolf", "big", 20);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("unicorn", "small", 10));
        //System.out.println(animals);

        for(Animal i: animals){
            doAnimalStuff(i);
        }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
        if(animal instanceof Mammal mammal){ //declaring the variable.
            mammal.shedhair();
        }
    }
}
