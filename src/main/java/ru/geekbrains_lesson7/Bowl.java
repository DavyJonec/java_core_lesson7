package ru.geekbrains_lesson7;

public class Bowl {
    private int foodAmount;


    public void putFoodInto(int amount) {
        this.foodAmount += amount;
        System.out.printf("Добавили еду в миску %d теперь в миске еды %d\n", amount, foodAmount);
    }

    public boolean decreaseFood(int amount) {
        if (this.foodAmount < amount) {
            System.out.printf("%d осталось еды,а коту хочется %d\n", foodAmount, amount);
            return false;
        } else {
            this.foodAmount -= amount;
            System.out.printf("Кот поел %d, осталось %d\n", amount, foodAmount);
                if (this.foodAmount == 0) {
                    System.out.println("В миске кончилась еда");
                }
                return true;
        }

    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
