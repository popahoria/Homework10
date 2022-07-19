package com.fasttrack.Exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("kiwi");
        fruitBasket.add("lemon");
        fruitBasket.add("banana");
        fruitBasket.add("orange");
        fruitBasket.add("apple");
        fruitBasket.add("pear");
        fruitBasket.add("grapes");
        Basket basket = new Basket(fruitBasket);
        System.out.println(basket.find("apple"));
        System.out.println(basket.remove("apple"));
        System.out.println(basket.find("apple"));
        System.out.println(basket);
        System.out.println(basket.position("orange"));
        System.out.println(basket.position("apple:"));
        System.out.println(basket.distinct().toString());
        fruitBasket.add("melon");
        System.out.println(basket.count());



    }
}
