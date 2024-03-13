package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Box<Apple> AppleBox1 = new Box<>();

        Box<Apple> AppleBox2 = new Box<>();

        Box<Orange> OrangeBox = new Box<>();



        Apple apple1 = new Apple();

        Apple apple2 = new Apple();

        Orange orange = new Orange();



        AppleBox1.addFruit(apple1);

        AppleBox2.addFruit(apple2);

        OrangeBox.addFruit(orange);



        System.out.println("Вес коробки с яблоками1 : " + AppleBox1.getWeight());

        System.out.println("Вес коробки с яблоками2: " + AppleBox2.getWeight());

        System.out.println("Вес коробки с апельсинами: " + OrangeBox.getWeight());



        System.out.println("Сравниваем коробу с яблоками1 и коробку с яблоками2: " + AppleBox1.compare(AppleBox2));

        System.out.println("Сравниваем коробу с яблоками1 и коробку с апельсинами: " + AppleBox1.compare(OrangeBox));



        AppleBox1.transfer(AppleBox2);



        System.out.println("Вес коробки с яблоками1 после сортировки: " + AppleBox1.getWeight());

        System.out.println("Вес коробки с яблоками2 после сортировки: " + AppleBox2.getWeight());

    }

}
