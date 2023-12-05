package bg.smg;

public class Vegetable extends Food{
    private boolean isFresh = true;

    public Vegetable(boolean isFresh) {
    }

    public Vegetable(String name, double kg, boolean isFresh) {
        super(name, kg);
        this.isFresh = isFresh;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "isFresh=" + isFresh +
                '}';
    }
}
