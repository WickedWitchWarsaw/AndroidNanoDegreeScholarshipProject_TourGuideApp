package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);
    }

    public static void startHistoricalActivity(Context context){
        Intent historicalActivityIntent = new Intent(context, HistoricalActivity.class);
        context.startActivity(historicalActivityIntent);
    }
}
