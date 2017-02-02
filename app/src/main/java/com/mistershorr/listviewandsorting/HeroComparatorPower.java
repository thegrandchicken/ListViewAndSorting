package com.mistershorr.listviewandsorting;

import com.mistershorr.listviewandsorting.Superhero;

import java.util.Comparator;

/**
 * Created by ysmak on 1/23/17.
 */

public class HeroComparatorPower implements Comparator<Superhero> {
    @Override
    public int compare(Superhero hero1, Superhero hero2) {
        return hero1.getPower().length() - hero2.getPower().length();
    }
}
