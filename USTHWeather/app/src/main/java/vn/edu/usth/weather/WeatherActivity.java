package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        PagerAdapter adapter = new Adapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        tabLayout.setupWithViewPager(pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
    }
}