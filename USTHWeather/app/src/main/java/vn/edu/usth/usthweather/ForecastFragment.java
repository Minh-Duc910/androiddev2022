package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {


    public ForecastFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_forecast, container, false);
        rootview.setBackgroundColor(Color.YELLOW);

        LinearLayout ll = new LinearLayout(getActivity());
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView day = new TextView(getActivity());
        day.setText("Thursday");
        ll.addView(day);

        ImageView wz = new ImageView(getActivity());
        wz.setImageResource(R.drawable.rainy_1);
        ll.addView(wz);

        return rootview;
    }
}