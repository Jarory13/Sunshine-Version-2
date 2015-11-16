package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        private ArrayAdapter<String> mForecastAdapter;

        public PlaceholderFragment() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            //mock string data for weather forcast
            String [] forecastArray = {
                "Today - Sunny 75/50",
                "Tomorrow - Sunny 70/48",
                "Weds - Cloudy - 68/48",
                "Thurs - Rain - 65/42",
                "Fri - Meteor Shower - 100/50",
                "Sat - Apocalypse - 1000/10000",
                "Sun - Eternal Darkness - 0/0"
            };

            //Array list to populate the Listview
            List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

            //This adapter will take the above data and pass it into the listview
            mForecastAdapter =
            new ArrayAdapter<String>(
                //Will set this for the current activity
                getActivity(),
                //ID of layout
                R.layout.list_item_forecast,
                //ID of text
                R.id.list_item_forecast_textview,
                //Data to pass in
                weekForecast);

            //Find the list view and attach adapter to it.
            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(mForecastAdapter);

            return rootView;
        }
    }
}
