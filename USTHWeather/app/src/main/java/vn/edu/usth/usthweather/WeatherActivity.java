package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ForecastFragment ff = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.ff, ff).commit();


    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("WeatherActivity","Start");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("WeatherActivity","Resume");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("WeatherActivity","Pause");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("WeatherActivity","Stop");

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("WeatherActivity","Destroy");

    }
}