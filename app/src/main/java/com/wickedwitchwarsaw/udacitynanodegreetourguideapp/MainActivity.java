package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

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
        AttractionsActivity.startAttractionsActivity(this);
    }

    @OnClick(R.id.textView_historicMonuments)
    public void goToHistoricMonumentsScreen() {
        HistoricalActivity.startHistoricalActivity(this);
    }

    @OnClick(R.id.textView_restaurants)
    public void goToRestaurantsScreen(){
        RestaurantsActivity.startRestaurantsActivity(this);
    }

    @OnClick(R.id.textView_phrases)
    public void goToPhrasesScreen(){
        PhrasesActivity.startPhrasesActivity(this);
    }
}
