public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        this("Unknown", 0, 0, "Grey", "Rock pigeon");
    }

    public Pigeon(String name, String species) {
        this(name, 0, 0, "Grey", species);
    }

    public Pigeon(String name, int age, double weight,
                  String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats grains and seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " coos: Coo!");
    }

    public void findHome() {
        System.out.println(getName() + " finds its way home.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString()
                + ", species=" + species + "}";
    }
}
