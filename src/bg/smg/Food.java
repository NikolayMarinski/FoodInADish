package bg.smg;

public class Food {

    private String name;
    private double kg;

    @Override
    public String toString() {
        return name;
    }

    public Food() {

    }
    public Food(String name, double kg) {
        this.name = name;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }


}
