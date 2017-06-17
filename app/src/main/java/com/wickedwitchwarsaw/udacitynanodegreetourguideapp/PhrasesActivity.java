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
        phrasesList.add(new Phrase(getResources().getString(R.string.pe1), getResources().getString(R.string.pp1)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe2), getResources().getString(R.string.pp2)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe3), getResources().getString(R.string.pp3)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe4), getResources().getString(R.string.pp4)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe5), getResources().getString(R.string.pp5)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe6), getResources().getString(R.string.pp6)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe7), getResources().getString(R.string.pp7)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe8), getResources().getString(R.string.pp8)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe9), getResources().getString(R.string.pp9)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe10), getResources().getString(R.string.pp10)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe11), getResources().getString(R.string.pp11)));
        phrasesList.add(new Phrase(getResources().getString(R.string.pe12), getResources().getString(R.string.pp12)));

        PhraseAdapter phraseAdapter = new PhraseAdapter(this, phrasesList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(phraseAdapter);
    }

    public static void startPhrasesActivity(Context context) {
        Intent phrasesActivityIntent = new Intent(context, PhrasesActivity.class);
        context.startActivity(phrasesActivityIntent);
    }

    @OnClick(R.id.imageview_main_menu)
    public void backToMainMenu() {
        MainActivity.startMainActivity(this);
    }
}
