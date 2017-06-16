package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_template);
        ButterKnife.bind(this);

        ArrayList<Phrase> phrasesList = new ArrayList<>();
        phrasesList.add(new Phrase("Good Morning", "Dzien Dobry"));
        phrasesList.add(new Phrase("Thank you", "Dziekuje"));
        phrasesList.add(new Phrase("Please", "Poprosze"));
        phrasesList.add(new Phrase("Yes", "Tak"));
        phrasesList.add(new Phrase("No", "Nie"));
        phrasesList.add(new Phrase("My name is...", "Nazywam sie..."));
        phrasesList.add(new Phrase("Two beers", "Dwa piwa"));
        phrasesList.add(new Phrase("I'd (he/she) like to order...", "Chcialbym/Chcialabym zamowic..."));
        phrasesList.add(new Phrase("Bill please", "Poprosze rachunek"));
        phrasesList.add(new Phrase("How much does in cost?", "Ile kosztuje?"));
        phrasesList.add(new Phrase("How to get to...", "Jak dojechac do..."));
        phrasesList.add(new Phrase("I don't understand", "Nie rozumiem"));

        PhraseAdapter phraseAdapter = new PhraseAdapter(this, phrasesList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(phraseAdapter);
    }

    public static void startPhrasesActivity(Context context){
        Intent phrasesActivityIntent = new Intent(context, PhrasesActivity.class);
        context.startActivity(phrasesActivityIntent);
    }

    @OnClick(R.id.imageview_main_menu)
    public void backToMainMenu(){
        MainActivity.startMainActivity(this);
    }
}
