public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        this("Unknown", 0, 0, "Unknown");
    }

    public Mammal(String name, String furColor) {
        this(name, 0, 0, furColor);
    }

    public Mammal(String name, int age,
                  double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats mammal food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a mammal sound.");
    }

    public void feedMilk() {
        System.out.println(getName() + " feeds its young milk.");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString()
                + ", furColor=" + furColor + "}";
    }
}
