package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_template);
    }

    public static void startAttractionsActivity(Context context){
        Intent attractionActivityIntent = new Intent(context, AttractionsActivity.class);
        context.startActivity(attractionActivityIntent);

    }
}
