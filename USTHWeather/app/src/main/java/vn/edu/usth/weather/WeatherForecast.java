package vn.edu.usth.weather;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class WeatherForecast extends Fragment {
    private String title;
    private int page;

    public static Fragment newInstance(int page, String title){
        Fragment fragment = new Fragment();
        Bundle args = new Bundle();
        args.putInt("someint",page);
        args.putString("somestring",title);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        MediaPlayer mediaPlayer = MediaPlayer.create(getContext(),R.raw.torch);
        mediaPlayer.start();

        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someint",0);
        title = getArguments().getString("sometitle");
    }
    public static WeatherForecast newInstance(){
        Bundle args = new Bundle();
        WeatherForecast fragment = new WeatherForecast();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_weather_forecast, container, false);
        return view;
    }
}