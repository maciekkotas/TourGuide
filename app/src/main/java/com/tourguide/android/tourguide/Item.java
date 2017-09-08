package com.tourguide.android.tourguide;

/**
 * Created by macie on 01.06.2017.
 */

public class Item {
    private int mImage;
    private int mTitle;
    private int mInfo;
    private int mLocalization;

    public Item(int title, int info, int image, int localization) {
        mImage = image;
        mTitle = title;
        mInfo = info;
        mLocalization = localization;


    }

    public int getImage() {
        return mImage;
    }

    public int getTitle() {
        return mTitle;
    }

    public int getInfo() {
        return mInfo;
    }

    public int getLocalization() {
        return mLocalization;
    }


}
