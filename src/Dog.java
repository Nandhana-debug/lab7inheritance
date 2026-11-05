public class Dog extends Mammal {
    private String breed;

    public Dog() {
        this("Unknown", 0, 0, "Unknown", "Unknown");
    }

    public Dog(String name, String breed) {
        this(name, 0, 0, "Unknown", breed);
    }

    public Dog(String name, int age, double weight,
               String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats dog food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " barks: Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " fetches a ball.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString()
                + ", breed=" + breed + "}";
    }
}
