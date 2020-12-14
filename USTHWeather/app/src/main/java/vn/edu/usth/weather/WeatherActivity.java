package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;


public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Created","onCreate");

//        TextView mTextView = (TextView) findViewById(R.id.text_message);
//        mTextView.setText("Hello world");
        ForecastFragment firstFrag = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.second_layout,firstFrag,null).commit();
        RelativeFragment firstLayout = new RelativeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.first_layout,firstLayout,null).commit();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stopped","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroyed","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Paused","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resumed","onResume");      }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Started","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Restarted","onRestart");
    }
}