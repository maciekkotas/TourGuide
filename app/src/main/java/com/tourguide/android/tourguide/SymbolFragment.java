package com.tourguide.android.tourguide;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class SymbolFragment extends Fragment {

    private ImageView playbutton, pausebutton;
    private MediaPlayer mediaPlayer;

    public SymbolFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.symbols_layout, container, false);

        playbutton = (ImageView) rootView.findViewById(R.id.play);
        pausebutton = (ImageView) rootView.findViewById(R.id.pause);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.hejnal_orkiestra);
                mediaPlayer.start();
                playbutton.setVisibility(View.GONE);
                pausebutton.setVisibility(View.VISIBLE);

            }
        });
        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                pausebutton.setVisibility(View.GONE);
                playbutton.setVisibility(View.VISIBLE);
            }
        });

        return rootView;

    }
}
