public class Blowfish extends Fish {
    private boolean poisonous;

    public Blowfish() {
        this("Unknown", 0, 0, "Saltwater", true);
    }

    public Blowfish(String name, boolean poisonous) {
        this(name, 0, 0, "Saltwater", poisonous);
    }

    public Blowfish(String name, int age, double weight,
                    String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats small shellfish.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a quiet fish sound.");
    }

    public void inflate() {
        System.out.println(getName() + " inflates its body.");
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString()
                + ", poisonous=" + poisonous + "}";
    }
}
