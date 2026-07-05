import java.util.*;

interface MealPlan {}

class VegetarianMeal implements MealPlan {
    public String toString() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String toString() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String toString() {
        return "Keto Meal";
    }
}

class Meal<T extends MealPlan> {

    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void display() {
        System.out.println(plan);
    }
}

public class MealGenerator {

    public static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println("Generated : " + plan);
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 =
                new Meal<>(new VegetarianMeal());

        Meal<KetoMeal> m2 =
                new Meal<>(new KetoMeal());

        m1.display();
        m2.display();

        generateMeal(new VeganMeal());
    }
}