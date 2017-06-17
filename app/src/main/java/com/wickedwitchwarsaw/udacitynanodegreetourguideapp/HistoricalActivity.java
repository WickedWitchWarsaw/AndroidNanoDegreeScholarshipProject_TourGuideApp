package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_template);
        ButterKnife.bind(this);

        ArrayList<Attraction> historicalMonument = new ArrayList<>();
        historicalMonument.add(new Attraction(getResources().getString(R.string.hn1), getResources().getString(R.string.hl1), R.drawable.zygmunt));
        historicalMonument.add(new Attraction(getResources().getString(R.string.hn2), getResources().getString(R.string.hl2),
                R.drawable.copernicus));
        historicalMonument.add(new Attraction(getResources().getString(R.string.hn3), getResources().getString(R.string.hl3),
                R.drawable.mickiewicz));
        historicalMonument.add(new Attraction(getResources().getString(R.string.hn4), getResources().getString(R.string.hl4), R.drawable.chopin));
        historicalMonument.add(new Attraction(getResources().getString(R.string.hn5), getResources().getString(R.string.hl5), R.drawable.getto));

        HistoricalAdapter historicalAdapter = new HistoricalAdapter(this, historicalMonument);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(historicalAdapter);
    }

    public static void startHistoricalActivity(Context context){
        Intent historicalActivityIntent = new Intent(context, HistoricalActivity.class);
        context.startActivity(historicalActivityIntent);
    }

    @OnClick(R.id.imageview_main_menu)
    public void backToMainMenu(){
        MainActivity.startMainActivity(this);
    }
}
