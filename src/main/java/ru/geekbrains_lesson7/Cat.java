package ru.geekbrains_lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = false;
    }

    public void eat(Bowl bowl) {
        System.out.printf("Кот %s голоден\n", this.name);
        do {
            hunger = bowl.decreaseFood(appetite);
            if (hunger) {
                System.out.printf("Кот %s утолил голод\n", this.name);
            } else {
                System.out.printf("Кот %s голоден всё ещё\n", this.name);
                bowl.putFoodInto(50);
            }
        } while (!hunger);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
