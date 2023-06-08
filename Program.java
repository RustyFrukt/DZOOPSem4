package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.List;
public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        List<Apple> apples1 = new ArrayList<>(List.of(new Apple(), new Apple(), new Apple()));
        List<Apple> apples2 = new ArrayList<>(List.of(new Apple(), new Apple(), new Apple(), new Apple()));
        List<Orange> oranges = new ArrayList<>(List.of(new Orange(), new Orange()));
        List<Orange> oranges1 = new ArrayList<>(List.of(new Orange(), new Orange(), new Orange(), new Orange()));
        List<Orange> oranges2 = new ArrayList<>(List.of(new Orange(), new Orange()));

        Box<Apple> appleBox1 = new Box<>(apples1);
        Box<Apple> appleBox2 = new Box<>(apples2);
        Box<Orange> orangeBox = new Box<>(oranges);
        Box<Orange> orangeBox1 = new Box<>(oranges1);
        Box<Orange> orangeBox2 = new Box<>(oranges2);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox);
        System.out.println(orangeBox1);
        System.out.println(orangeBox2);

        System.out.println(appleBox1.compare(orangeBox));
        System.out.println(appleBox2.compare(orangeBox));

        appleBox1.put(appleBox2);
        orangeBox1.put(orangeBox2);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox);
        System.out.println(orangeBox1);
        System.out.println(orangeBox2);

    }
}