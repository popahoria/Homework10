package com.fasttrack.Exercise2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("trandafir");
        set.add("lalea");
        set.add("ghiocel");
        set.add("musetel");
        set.add("gherbera");
        set.add("cala");
        set.add("orhidee");
        set.add("nufar");
        Bouquet bouquet = new Bouquet(set);
        System.out.println(bouquet.getAll());
        bouquet.add("gladiola");
        System.out.println(bouquet);
        bouquet.remove("musetel");
        System.out.println(bouquet);
    }
}
