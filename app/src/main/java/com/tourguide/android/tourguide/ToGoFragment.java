package com.tourguide.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ToGoFragment extends Fragment {

    public ToGoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> item = new ArrayList<Item>();

        item.add(new Item(R.string.academic_church, R.string.academic_info, R.drawable.academic_church, R.string.academic_localization));
        item.add(new Item(R.string.basilica, R.string.basilica_info, R.drawable.basilica, R.string.basilica_localization));
        item.add(new Item(R.string.fountain, R.string.fountain_info, R.drawable.fountain, R.string.fountain_localization));
        item.add(new Item(R.string.ruda, R.string.ruda_info, R.drawable.ruda, R.string.ruda_localization));
        item.add(new Item(R.string.old_market, R.string.old_market_info, R.drawable.old_market, R.string.old_markret_localization));
        item.add(new Item(R.string.theme_park, R.string.theme_park_info, R.drawable.them_park, R.string.theme_park_localization));
        item.add(new Item(R.string.waw_church, R.string.waw_church_info, R.drawable.waw_church, R.string.waw_church_localization));
        item.add(new Item(R.string.old_town_hall, R.string.old_town_hall_info, R.drawable.old_town_hall, R.string.old_town_hall_localization));
        item.add(new Item(R.string.castle, R.string.castle_info, R.drawable.castle, R.string.castle_localization));

        ItemAdapter adapter = new ItemAdapter(getActivity(), item, R.color.colorPrimaryLight);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
