package com.mistershorr.listviewandsorting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gshorr on 1/19/17.
 */
public class HeroAdapter extends ArrayAdapter<Superhero> {

    public HeroAdapter(Context context, List<Superhero> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //if not given a view, we need to make one
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_hero, null);
        }
        //get the item at the position where we are
        Superhero hero = getItem(position);

        //wire up our view
        TextView nameText = (TextView) convertView.findViewById(R.id.text_name);
        TextView powerText = (TextView) convertView.findViewById(R.id.text_power);
        TextView rankText = (TextView) convertView.findViewById(R.id.text_rank);

        //put the text of the hero into the appropriate views
        nameText.setText(hero.getName());
        powerText.setText(hero.getPower());
        rankText.setText("" + hero.getRanking());


        //return the view that you had edited
        return convertView;

    }
}
