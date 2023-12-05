package bg.smg;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();

        FoodInADish<Food> bananaBlue = new FoodInADish<Food>();

        Food banana = new Food();
        banana.setName("banana");
        banana.setKg(0.6);
        ((Fruit)banana).setReadyToEat(true);

        Food apple = new Food();
        apple.setName("apple");
        apple.setKg(0.4);
        ((Fruit)apple).setReadyToEat(true);

        bananaBlue.setFood(banana);
        bananaBlue.setDishColour("blue");

        appleGreen.setFood(apple);
        appleGreen.setDishColour("green");


        dishes.add(bananaBlue);
	    dishes.add(appleGreen);

        FoodInADish<Food> bananaDish = new FoodInADish<>();
        FoodInADish<Food> appleDish = new FoodInADish<>();
        FoodInADish<Food> tomatoDish = new FoodInADish<>();




    }
}
