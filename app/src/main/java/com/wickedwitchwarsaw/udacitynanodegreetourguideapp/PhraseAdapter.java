package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by ZuZ on 14/06/2017.
 */
public class PhraseAdapter extends ArrayAdapter<Phrase>{
    public PhraseAdapter(Activity context, ArrayList<Phrase> phrasesList) {
        super(context, 0, phrasesList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Phrase currentPhrase = getItem(position);
        View listViewItem = convertView;
        if(listViewItem == null){
         listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.phrases_list, parent, false);
        }

        TextView polishTranslation = (TextView) listViewItem.findViewById(R.id.translation_polish);
        polishTranslation.setText(currentPhrase.getTranslationPolish());

        TextView englishTranslation = (TextView) listViewItem.findViewById(R.id.translation_english);
        englishTranslation.setText(currentPhrase.getTranslationEnglish());

        return listViewItem;
    }
}
