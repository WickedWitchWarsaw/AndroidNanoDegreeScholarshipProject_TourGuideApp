package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_template);
        ButterKnife.bind(this);

        ArrayList<Attraction> eventList = new ArrayList<>();
        eventList.add(new Attraction(getResources().getString(R.string.en1), getResources().getString(R.string.ed1),
                getResources().getString(R.string.et1), getResources().getString(R.string.el1)));
        eventList.add(new Attraction(getResources().getString(R.string.en2), getResources().getString(R.string.ed2),
                getResources().getString(R.string.et2), getResources().getString(R.string.el2)));
        eventList.add(new Attraction(getResources().getString(R.string.en3), getResources().getString(R.string.ed3),
                getResources().getString(R.string.et3), getResources().getString(R.string.el3)));
        eventList.add(new Attraction(getResources().getString(R.string.en4), getResources().getString(R.string.ed4),
                getResources().getString(R.string.et4), getResources().getString(R.string.el4)));
        eventList.add(new Attraction(getResources().getString(R.string.en5), getResources().getString(R.string.ed5),
                getResources().getString(R.string.et5), getResources().getString(R.string.el5)));
        eventList.add(new Attraction(getResources().getString(R.string.en6), getResources().getString(R.string.ed6),
                getResources().getString(R.string.et6), getResources().getString(R.string.el6)));
        eventList.add(new Attraction(getResources().getString(R.string.en7), getResources().getString(R.string.ed7),
                getResources().getString(R.string.et7), getResources().getString(R.string.el7)));
        eventList.add(new Attraction(getResources().getString(R.string.en8), getResources().getString(R.string.ed8),
                getResources().getString(R.string.et8), getResources().getString(R.string.el8)));
        eventList.add(new Attraction(getResources().getString(R.string.en9), getResources().getString(R.string.ed9),
                getResources().getString(R.string.et9), getResources().getString(R.string.el9)));

        EventAdapter eventAdapter = new EventAdapter(this, eventList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(eventAdapter);
    }

    public static void startAttractionsActivity(Context context){
        Intent attractionActivityIntent = new Intent(context, EventsActivity.class);
        context.startActivity(attractionActivityIntent);
    }

    @OnClick(R.id.imageview_main_menu)
    public void backToMainMenu(){
        MainActivity.startMainActivity(this);
    }
}
