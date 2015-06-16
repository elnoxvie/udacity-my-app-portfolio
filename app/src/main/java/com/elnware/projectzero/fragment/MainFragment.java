package com.elnware.projectzero.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.elnware.projectzero.R;

/**
 * Created by elnoxvie on 8/6/15.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnSpotifyStreamer = (Button) view.findViewById(R.id.btnSpotifyStreamer);
        Button btnScoresApp       = (Button) view.findViewById(R.id.btnScoresApp);
        Button btnBuildItBigger   = (Button) view.findViewById(R.id.btnBuildItBigger);
        Button btnCapStone1       = (Button) view.findViewById(R.id.btnCapstone1);
        Button btnLibraryApp      = (Button) view.findViewById(R.id.btnLibraryApp);
        Button btnXyzReader       = (Button) view.findViewById(R.id.btnXyzReader);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnCapStone1.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSpotifyStreamer:
                toast(getString(R.string.button_click_msg, getString(R.string.spotify_streamer)));
                break;
            case R.id.btnScoresApp:
                toast(getString(R.string.button_click_msg, getString(R.string.scores_app)));
                break;
            case R.id.btnBuildItBigger:
                toast(getString(R.string.button_click_msg, getString(R.string.build_it_bigger)));
                break;
            case R.id.btnCapstone1:
                toast(getString(R.string.button_click_msg, getString(R.string.capstone_my_project)));
                break;
            case R.id.btnLibraryApp:
                toast(getString(R.string.button_click_msg, getString(R.string.library_app)));
                break;
            case R.id.btnXyzReader:
                toast(getString(R.string.button_click_msg, getString(R.string.xyz_reader)));
                break;
        }
    }

    private void toast(String text){
        Toast.makeText(getActivity(), text, Toast.LENGTH_LONG).show();
    }
}
