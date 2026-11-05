public class Fish extends Animal {
    private String waterType;

    public Fish() {
        this("Unknown", 0, 0, "Unknown");
    }

    public Fish(String name, String waterType) {
        this(name, 0, 0, waterType);
    }

    public Fish(String name, int age,
                double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes an underwater sound.");
    }

    public void swim() {
        System.out.println(getName() + " swims.");
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString()
                + ", waterType=" + waterType + "}";
    }
}
