package com.tourguide.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by macie on 31.05.2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    private int mColorResourceId;

    public ItemAdapter(Context context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        Item currentItem = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.list_image_view);
        image.setImageResource(currentItem.getImage());
        TextView title = (TextView) listItemView.findViewById(R.id.list_title);
        title.setText(currentItem.getTitle());
        TextView info = (TextView) listItemView.findViewById(R.id.list_info);
        info.setText(currentItem.getInfo());
        TextView localization = (TextView) listItemView.findViewById(R.id.list_localization);
        localization.setText(currentItem.getLocalization());

        View textContainer = listItemView.findViewById(R.id.item_view);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

