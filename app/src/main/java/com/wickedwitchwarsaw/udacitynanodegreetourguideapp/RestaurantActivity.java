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
        restaurantList.add(new Attraction("Blue Cactus", "Zajaczkowska 11", R.drawable.number_nine));
        restaurantList.add(new Attraction("Same Krafty", "10 Ul. Nowomiejska", R.drawable.number_one));
        restaurantList.add(new Attraction("Mr India - Indian Restaurant", "Al. Ken 47 | Metro Natolin", R.drawable.number_four));
        restaurantList.add(new Attraction("Bulke przez Bibulke Restaurant", "ul. Zgoda 3", R.drawable.number_one));
        restaurantList.add(new Attraction("Hoza", "Ul Hoza 25", R.drawable.number_nine));
        restaurantList.add(new Attraction("Tortilla Factory", "ul Wilcza 5", R.drawable.number_four));
        restaurantList.add(new Attraction("Der Elefant", "ul. Plac Bankowy 1", R.drawable.number_seven));

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
