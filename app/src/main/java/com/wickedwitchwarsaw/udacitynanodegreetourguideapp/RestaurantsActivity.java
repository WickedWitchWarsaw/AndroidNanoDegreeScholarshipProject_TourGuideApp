package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
    }

    public static void startRestaurantsActivity(Context context){
        Intent startRestaurantsActivity = new Intent(context, RestaurantsActivity.class);
        context.startActivity(startRestaurantsActivity);
    }
}
