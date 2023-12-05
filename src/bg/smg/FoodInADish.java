package bg.smg;

import javax.swing.*;

public class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColour;


    public FoodInADish() {

    }

    public FoodInADish(int xCoord, int yCoord, int width, int height, T food, String dishColour) {
        super(xCoord, yCoord, width, height);
        this.food = food;
        this.dishColour = dishColour;
    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        if(o.getFood() instanceof Fruit && this.food instanceof Fruit){
            return Double.compare(((Fruit)this.food).getKg(),((Fruit)o.getFood()).getKg());
        }
        else if(o.getFood() instanceof Vegetable && this.food instanceof Vegetable){
            return Double.compare(((Vegetable)this.food).getKg(),((Vegetable)o.getFood()).getKg());
        }
        else {
            return Double.compare(((Fruit)this.food).getKg(),((Vegetable)o.getFood()).getKg());
        }
        return 0;
    }

    @Override
    public JPanel draw() {

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
