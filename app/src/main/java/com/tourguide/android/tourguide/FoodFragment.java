package com.tourguide.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {


    public FoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);


        ArrayList<Item> item = new ArrayList<Item>();
        item.add(new Item(R.string.ino_wino, R.string.ino_wino_info, R.drawable.ino_wino, R.string.ino_wino_localization));
        item.add(new Item(R.string.japan_sun, R.string.japan_sun_info, R.drawable.japan_sun, R.string.japan_sun_localization));
        item.add(new Item(R.string.bizon, R.string.bizon_info, R.drawable.bizon, R.string.bizon_localization));
        item.add(new Item(R.string.hajda, R.string.hajda_info, R.drawable.hajda, R.string.hajda_localization));
        item.add(new Item(R.string.santorini, R.string.santorini_info, R.drawable.santorini, R.string.santorini_localization));
        item.add(new Item(R.string.dares, R.string.dares_info, R.drawable.dares, R.string.dares_localization));
        item.add(new Item(R.string.martinez, R.string.martinez_info, R.drawable.martinez, R.string.martinez_localization));
        item.add(new Item(R.string.lili, R.string.lili_info, R.drawable.lili, R.string.lili_localization));
        item.add(new Item(R.string.delicje, R.string.delicje_info, R.drawable.delicje, R.string.delicje_localization));
        item.add(new Item(R.string.europa, R.string.europa_info, R.drawable.europa, R.string.europa_localization));

        ItemAdapter adapter = new ItemAdapter(getActivity(), item, R.color.colorPrimaryLight);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }
}
