package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_template);
        ButterKnife.bind(this);

        ArrayList<Attraction> restaurantList = new ArrayList<>();
        restaurantList.add(new Attraction(getResources().getString(R.string.rn1), getResources().getString(R.string.rl1), R.drawable.number_nine));
        restaurantList.add(new Attraction(getResources().getString(R.string.rn2), getResources().getString(R.string.rl2), R.drawable.number_one));
        restaurantList.add(new Attraction(getResources().getString(R.string.rn3), getResources().getString(R.string.rl3), R.drawable.number_four));
        restaurantList.add(new Attraction(getResources().getString(R.string.rn4), getResources().getString(R.string.rl4), R.drawable.number_one));
        restaurantList.add(new Attraction(getResources().getString(R.string.rn5), getResources().getString(R.string.rl5), R.drawable.number_nine));
        restaurantList.add(new Attraction(getResources().getString(R.string.rn6), getResources().getString(R.string.rl6), R.drawable.number_four));
        restaurantList.add(new Attraction(getResources().getString(R.string.rn7), getResources().getString(R.string.rl7), R.drawable.number_seven));

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, restaurantList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(restaurantAdapter);
    }

    public static void startRestaurantsActivity(Context context) {
        Intent startRestaurantsActivity = new Intent(context, RestaurantActivity.class);
        context.startActivity(startRestaurantsActivity);
    }

    @OnClick(R.id.imageview_main_menu)
    public void backToMainMenu() {
        MainActivity.startMainActivity(this);
    }
}
