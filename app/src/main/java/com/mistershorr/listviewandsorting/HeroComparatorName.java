package com.mistershorr.listviewandsorting;

import java.util.Comparator;

/**
 * Created by ysmak on 1/23/17.
 */

public class HeroComparatorName implements Comparator<Superhero> {
    @Override
    public int compare(Superhero hero1, Superhero hero2) {
        return hero1.getName().compareTo(hero2.getName());
    }
}
