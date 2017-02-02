package com.mistershorr.listviewandsorting;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by gshorr on 1/19/17.
 */
public class SuperheroFragment extends ListFragment {
    private List<Superhero> heroes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        //create our list of heroes
        heroes = new ArrayList<>();
        populateList();
        //Collections.sort(heroes);
        //Collections.sort(heroes, new HeroComparatorName());
        Collections.sort(heroes, new HeroComparatorPower());

        //fill the custom adapter
        HeroAdapter adapter = new HeroAdapter(getActivity(), heroes);

        //set the listView's adapter
        setListAdapter(adapter);

        return rootView;
    }

    private void populateList() {
        heroes.add(new Superhero("Stapleman",
                "Can staple really thick stacks of paper", 10));
        heroes.add(new Superhero("Superhero creator person",
                "Can come up with interesting superhero names and powers", 205));
        heroes.add(new Superhero("Captain Sloth",
                "Can have algae grow on them during the wet season", 7));
        heroes.add(new Superhero("Nobel Prize Fixer",
                "Can go back in time and award the physics nobel prizes to the women who deserved them", 150));

    }
}
