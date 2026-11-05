public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Mammal(),
                new Bird("Tweety", "Yellow"),
                new Fish("Nemo", 2, 0.3, "Saltwater"),
                new Dog("Buddy", 3, 15, "Brown", "Beagle"),
                new Blowfish("Puffy", true),
                new Pigeon()
        };

        animals[0].setName("Molly");
        animals[5].setName("Sky");

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.getVoice();
            System.out.println();
        }

        ((Mammal) animals[0]).feedMilk();
        ((Bird) animals[1]).fly();
        ((Fish) animals[2]).swim();
        ((Dog) animals[3]).fetch();
        ((Blowfish) animals[4]).inflate();
        ((Pigeon) animals[5]).findHome();
    }
}
