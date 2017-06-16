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
        eventList.add(new Attraction("Coldplay", "18th June", "8pm", "PGN Stadium"));
        eventList.add(new Attraction("Suzanne Vega", "26th June", "7pm", "Zlota 6"));
        eventList.add(new Attraction("Top Gear", "30th June", "5pm", "PGN Stadium"));
        eventList.add(new Attraction("Evanescence", "6th July", "7pm", "Pepsi Arena"));
        eventList.add(new Attraction("Multimedia Fountain Park", "Every Fri & Sat", "7pm", "Skwer im. I Dywizji Pancernej"));
        eventList.add(new Attraction("Wnet Warszawa Food Market", "Every Sat", "10am", "ul. Emilii Plater 31"));
        eventList.add(new Attraction("Depeche Mode", "16th July", "8pm", "Al. Ks. J. Poniatowskiego 1"));
        eventList.add(new Attraction("Gumball Rally", "26th July", "5pm", "Senatorska Street"));
        eventList.add(new Attraction("Flower Crowns on the Vistula", "6th August", "11am", "Skwer im. I Dywizji Pancernej"));

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
