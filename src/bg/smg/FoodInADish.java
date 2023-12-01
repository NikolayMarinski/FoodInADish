package bg.smg;

public class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColour;

    @Override
    public int compareTo(FoodInADish<T> o) {
        return 0;
    }

    @Override
    public void draw() {

    }


}
