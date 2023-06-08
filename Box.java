package ru.geekbrains.lesson4.homework;

import java.util.List;

public class Box<T extends Fruit>{
    private final List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight(){
        float result = 0;
        for (Fruit f : fruits) {
            result += f.getWeight();
        }
        return result;
    }

    public void add(T t){
        fruits.add(t);
    }

    public boolean compare (Box<? extends Fruit> otherBox){
        return this.getWeight() == otherBox.getWeight();
    }

    public void put(Box<T> otherBox){
        for (T f : fruits)
            otherBox.add(f);
        fruits.clear();
    }

    @Override
    public String toString() {
        return String.format("В данной корзине %d фрукта с весом %.2f кг", fruits.size(), this.getWeight());
    }
}