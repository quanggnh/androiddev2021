package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public Adapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment getItem(int page) {
// returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0: return WeatherForecast.newInstance();
            case 1: return WeatherForecast.newInstance();
            case 2: return WeatherForecast.newInstance();
            default: return WeatherForecast.newInstance();
        }
    }
    @Override
    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}
