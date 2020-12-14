package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WeatherForecast extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ForecastFragment firstFrag = new ForecastFragment();
        ft.add(R.id.second_layout,firstFrag,null).commit();
        RelativeFragment firstLayout = new RelativeFragment();
        ft.add(R.id.first_layout,firstLayout,null).commit();
        View view = inflater.inflate(R.layout.fragment_weather_forecast, container, false);
        return view;
    }
}