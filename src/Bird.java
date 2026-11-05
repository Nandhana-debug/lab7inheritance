public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        this("Unknown", 0, 0, "Unknown");
    }

    public Bird(String name, String featherColor) {
        this(name, 0, 0, featherColor);
    }

    public Bird(String name, int age,
                double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " chirps.");
    }

    public void fly() {
        System.out.println(getName() + " flies.");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString()
                + ", featherColor=" + featherColor + "}";
    }
}
