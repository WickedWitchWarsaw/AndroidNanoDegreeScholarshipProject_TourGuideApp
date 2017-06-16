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
        historicalMonument.add(new Attraction("King Sigismund's Column", "Zamkowy Square", R.drawable.zygmunt));
        historicalMonument.add(new Attraction("Nicolaus Copernicus Monument", "Krakowskie Przedmieście Street",
                R.drawable.copernicus));
        historicalMonument.add(new Attraction("Adam Mickiewicz Monument", " 5 Krakowskie Przedmieście Street",
                R.drawable.mickiewicz));
        historicalMonument.add(new Attraction("Chopin Monument", "Łazienki Park", R.drawable.chopin));
        historicalMonument.add(new Attraction("Ghetto Heroes Monument", "ul. Zamenhofa", R.drawable.getto));

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
