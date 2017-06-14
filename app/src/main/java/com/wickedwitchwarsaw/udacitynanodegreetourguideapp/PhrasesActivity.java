package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
    }

    public static void startPhrasesActivity(Context context){
        Intent phrasesActivityIntent = new Intent(context, PhrasesActivity.class);
        context.startActivity(phrasesActivityIntent);
    }
}
