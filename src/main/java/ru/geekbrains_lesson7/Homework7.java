package ru.geekbrains_lesson7;

public class Homework7 {
    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        bowl.putFoodInto(100);

        Cat[] moreCats = {
                new Cat("Пифагор", 10 ),
                new Cat("Гераклит", 17 ),
                new Cat("Аристотель", 20),
                new Cat("Фалес", 22),
                new Cat("Бегемот", 140), //Мастер и Маргарита
        };
        for (Cat cats : moreCats) {
            cats.eat(bowl);
        }
    }
}