package bg.smg;

public class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColour;

    @Override
    public int compareTo(FoodInADish<T> o) {
        if(o.getFood() instanceof Fruit && this.food instanceof Fruit){
            return Double.compare(((Fruit)this.food).getKg(),((Fruit)o.getFood()).getKg());
        }
        else if(o.getFood() instanceof Vegetable && this.food instanceof Vegetable){
            return Double.compare(((Vegetable)this.food).getKg(),((Vegetable)o.getFood()).getKg());
        }
        else
    }

    @Override
    public void draw() {

    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColour() {
        return dishColour;
    }

    public void setDishColour(String dishColour) {
        this.dishColour = dishColour;
    }
}
