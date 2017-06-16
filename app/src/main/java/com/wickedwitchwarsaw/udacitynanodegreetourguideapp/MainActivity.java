package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.textView_attractions)
    public void goToAttractionsScreen() {
        EventsActivity.startAttractionsActivity(this);
    }

    @OnClick(R.id.textView_historicMonuments)
    public void goToHistoricMonumentsScreen() {
        HistoricalActivity.startHistoricalActivity(this);
    }

    @OnClick(R.id.textView_restaurants)
    public void goToRestaurantsScreen(){
        RestaurantActivity.startRestaurantsActivity(this);
    }

    @OnClick(R.id.textView_phrases)
    public void goToPhrasesScreen(){
        PhrasesActivity.startPhrasesActivity(this);
    }

    public static void startMainActivity(Context context){
        Intent mainActivityIntent = new Intent(context, MainActivity.class);
        context.startActivity(mainActivityIntent);
    }
}
