package org.example;

import java.util.ArrayList;
public class Box <T extends Fruit>{
    private ArrayList<T> fruits;
    public Box() {

        fruits = new ArrayList<>();

    }
    public float getWeight() {

        float totalWeight = 0;

        for (Fruit fruit : fruits) {

            totalWeight += fruit.getWeight();

        }

        return totalWeight;

    }
    public boolean compare(Box<?> anotherBox) {

        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;

    }
    public void transfer(Box<? super T> anotherBox) {

        if (this == anotherBox) {

            return;

        }

        anotherBox.fruits.addAll(this.fruits);

        this.fruits.clear();

    }
    public void addFruit(T fruit) {

        fruits.add(fruit);
    }
}

